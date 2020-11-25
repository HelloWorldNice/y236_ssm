package cn.bdqn.controller;

import cn.bdqn.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// http://localhost:9090/springmvc-day001/toLogin

@Controller
public class LoginController {

    @RequestMapping(value = "/toLogin", params = {"username=guoguo"})
    public String toLogin(String username) {
        return "login"; // 逻辑视图名
    }

    @RequestMapping(value = "/user/register")
    public void register(String username, String pwd, Integer age) {
        System.out.println(username);
        System.out.println(pwd);
        System.out.println(age);
    }

    @RequestMapping(value = "/user/registerForUser")
    public void registerForUser(User user) {
        System.out.println(user);
    }

    @RequestMapping(value = "/user/registerForUserAndRelation")
    public void registerForUserAndRelation(User user) {
        System.out.println(user);
    }

    @RequestMapping(value = "/user/registerForUserAndList")
    public void registerForUserAndList(User user) {
        System.out.println(user);
    }

    @RequestMapping(value = "/user/registerForUserAndMap")
    public void registerForUserAndMap(User user) {
        System.out.println(user);
    }

    @RequestMapping(value = "/user/registerForUserAndDate")
    public void registerForUserAndDate(User user) {
        System.out.println(user);
    }

    public void testRequest(List<String> list) {

    }
}
