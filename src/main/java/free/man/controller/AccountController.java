package free.man.controller;

import free.man.model.Account;
import free.man.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账户web层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    private Logger logger= LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层查询所有的账户信息");
        List<Account> list = accountService.findAll();
        System.out.println(list);
        return "list";
    }

}
