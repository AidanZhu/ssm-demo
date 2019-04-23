package com.ssm.demo.service.impl;

import com.ssm.demo.dao.IUserDAO;
import com.ssm.demo.entity.User;
import com.ssm.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @Author Aidan.Zhu
 * @Description //TODO 
 * @Date 11:27 2019/4/23
 * @Param 
 * @return 
 **/
@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Autowired
    public IUserDAO userDAO;

    public User getUserById(Integer id) {
        User user = userDAO.selectByPrimaryKey(id);
        return user;
    }
}
