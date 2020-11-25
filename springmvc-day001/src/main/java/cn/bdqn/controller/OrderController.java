package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/saveOrderForward")
    public String saveOrderForward() {
        return "/saveOrder.jsp"; // 默认: /WEB-INF/jsp/saveOrder.jsp 【请求转发】
    }

    @RequestMapping("/saveOrderRedirect")
    public String saveOrderRedirect() {
        return "redirect:/saveOrder.jsp";
    }

    @RequestMapping("/saveOrderForward2")
    public String saveOrderForward2() {
        return "foward:/WEB-INF/jsp/saveOrder2.jsp";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {

        return "<h1>hello,world</h1>";
    }
}
