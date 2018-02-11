package com.fblog.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fblog.dubbo.pojo.User;
import com.fblog.dubbo.service.UserService;
/**
 * 测试类
 * @author tarena
 */
@Controller
@RequestMapping("/test")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/{param}")
	@ResponseBody
	public String index(@PathVariable("param")String param){
		List<User> userList=userService.fingUser();
		System.out.println("前台数据查询成功:"+userList);
		return "前台成功";
	}
}
