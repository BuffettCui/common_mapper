package com.baizhi.controller;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 崔建昂
 * on 2019/4/10
 */
@Controller
@ResponseBody
@RequestMapping("user")
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("selectAll")
    public List<User> selectAll(){
        return userDao.selectAll();
    }
}
