package free.man.test;

import free.man.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac= new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        AccountService as=(AccountService) ac.getBean("accountService");
        as.findAll();
    }

    @Test
    public void run2(){
        System.out.println("");
    }

}
