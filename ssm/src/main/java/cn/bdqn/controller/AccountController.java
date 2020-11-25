package cn.bdqn.controller;

import cn.bdqn.domain.Account;
import cn.bdqn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/queryAll")
    public String queryAll(Model model){
        List<Account> accounts = accountService.queryAll();
        model.addAttribute("accounts",accounts);
        return "list";
    }

    @RequestMapping("/queryAll2")
    @ResponseBody
    public List<Account> queryAll2(Model model){
        List<Account> accounts = accountService.queryAll();
        return accounts;
    }
}
