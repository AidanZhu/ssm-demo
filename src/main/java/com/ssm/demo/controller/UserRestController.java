package com.ssm.demo.controller;

import com.ssm.demo.entity.User;
import com.ssm.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zh371 on 2019/4/23.
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/query",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryUser(@RequestParam("uid") int uid, HttpServletRequest request) {
        User user = userService.getUserById(uid);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code","0");
        map.put("msg",null);
        map.put("users",user);
        return map;
        //return service.poHeaderQuery(requestContext,dto,page,pageSize);
    }
}
