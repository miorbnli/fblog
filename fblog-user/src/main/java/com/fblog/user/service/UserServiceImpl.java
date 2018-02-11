package com.fblog.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fblog.dubbo.pojo.User;
import com.fblog.dubbo.service.UserService;
import com.fblog.user.mapper.UserMapper;

import redis.clients.jedis.JedisCluster;
/**
 * 测试前台系统的实现类,可以删除
 * @author tarena
 *
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private JedisCluster jedisCluster;
	
	private static ObjectMapper objectMapper=new ObjectMapper();
	@Override
	public List<User> fingUser() {
		List<User> list = userMapper.selectAll();
		try {
			String userJSON = objectMapper.writeValueAsString(list);
			jedisCluster.set("JSON_3", userJSON);
			System.out.println("redis缓存测试存取成功="+jedisCluster.get("JSON_1"));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println("user测试成功");
		return list;
	}
	
}
