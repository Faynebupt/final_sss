package com.lll.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lll.dao.UserDao;
import com.lll.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by NewUser on 2017/11/07.
 */
@Controller
public class myController {
//    @RequestMapping(value = "/")
//    public String index(ModelMap map) {
//        map.addAttribute("host","http://lll.com");
//        return "index";
//    }
//
//    @RequestMapping(value = "/greeting")
//    public String index(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name",name);
//        model.addAttribute("host","http://lll.com");
//        return "greeting";
//    }
//
//    //提交表单后进行数据读取，并将数据传出
//    @RequestMapping(value = "/temp",method = RequestMethod.POST)
//    public String bb(User user,Model model) {
//        model.addAttribute("user", user);
//        model.addAttribute("message", ",welcome");
//        return "temp";
//    }



    @RequestMapping(value = "/index")
    public String indexfinal(ModelMap map,HttpServletRequest request, HttpServletResponse response){
        User user1=new User();
        user1.setAge(100);
        user1.setId(1001);
        user1.setName("lvliang");
        map.addAttribute("user",user1);
        map.addAttribute("message","this is temp1 message");

        return "index";
    }

    @RequestMapping(value="/temp1")
    public String temp1(ModelMap map){

        return "jj";
    }
    @RequestMapping(value = "/ddindex", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
       // request.getSession().removeAttribute("user");
       // request.getSession().getClass();
        return "temp1";
    }

}
