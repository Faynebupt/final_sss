package com.lll.service;
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
 * Created by NewUser on 2017/11/08.
 */
public class service1 {
    @Autowired
    private UserDao userDao;


}
