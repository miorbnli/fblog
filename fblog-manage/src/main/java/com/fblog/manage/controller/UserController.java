package com.fblog.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fblog.dubbo.pojo.User;
import com.fblog.dubbo.service.UserService;

/**
 * 测试类,可以删除
 * @author tarena
 */
@Controller
@RequestMapping("/test")
public class UserController {
	//调用自己的srvice引得是自己项目中的UserService,调用其他项目引用dubbo中的UserService
	@Autowired
	private UserService userService;
	
	@RequestMapping("/{param}")
	@ResponseBody
	public String index(@PathVariable("param")String param){
		List<User> userList=userService.fingUser();
		System.out.println("后台数据查询成功:"+userList);
		return "后台成功";
	}
}
