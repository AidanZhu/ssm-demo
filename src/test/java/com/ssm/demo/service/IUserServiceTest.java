package com.ssm.demo.service;

/*
 * @Author Aidan.Zhu
 * @Description //TODO 
 * @Date 13:43 2019/4/23
 * @Param 
 * @return 
 **/

import com.ssm.demo.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IUserServiceTest {

    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService uService = (IUserService) application.getBean("userService");
        User user = uService.getUserById(1);
        System.out.println("user name is :"+user.getUserName());
    }

}
