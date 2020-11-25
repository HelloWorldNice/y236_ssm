package cn.bdqn.controller;

import cn.bdqn.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(Person person) {
        System.out.println(person);
        Map<String, Object> resultMap = new HashMap<String, Object>();

        // service---User
        Person p1 = new Person();
        if (p1 == null) {
            resultMap.put("code", 1099);
            resultMap.put("message", "网络异常，请检查网络...");
        } else {
            resultMap.put("code", 200);
            resultMap.put("message", "登录成功");
        }
        return resultMap;
    }

    @RequestMapping("/login3")
    @ResponseBody
    public Map<String, Object> login3(@RequestBody Person person) {
        System.out.println(person);
        Map<String, Object> resultMap = new HashMap<String, Object>();

        // service---User
        Person p1 = new Person();
        if (p1 == null) {
            resultMap.put("code", 1099);
            resultMap.put("message", "网络异常，请检查网络...");
        } else {
            resultMap.put("code", 200);
            resultMap.put("message", "登录成功");
        }
        return resultMap;
    }

}
