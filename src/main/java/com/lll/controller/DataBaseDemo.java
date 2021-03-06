package com.lll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lll.dao.UserDao;
import com.lll.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

/**
 * Created by qaa on 2017/7/11.
 */
@Controller
@RequestMapping(value = "/database")
public class DataBaseDemo {
    @Autowired
    private UserDao userDao;



    @RequestMapping(value = "/selectall")
    @ResponseBody
    public String showUser() {
        List<User> list = userDao.findAll();
        String str = "";
        for (User user : list) {
            str += user.toString() + "\n";
        }
        System.out.println(str);
        return str;
}


    @RequestMapping(value = "/selectbyname")
    @ResponseBody
    public String user_to(){
        User user = userDao.findByName("spring");
        return user.toString();
    }

    @RequestMapping(value = "/selectbyage")
    @ResponseBody
    public String selectByAge(){
        User user = userDao.getByAge(60);
        return user.toString();
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public String deleteUser(){
        userDao.delete(0L);
        return "Delete scompleted!";
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public String addUser(){
        User user = new User("cumt",60);
        userDao.save(user);
        return "Add completed!";
    }



}