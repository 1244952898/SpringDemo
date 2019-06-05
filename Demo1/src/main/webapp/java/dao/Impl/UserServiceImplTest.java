package dao.Impl;


import dao.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

    @Test
    public void save() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/ApplicationContext.xml");
        UserService userService= (UserService) applicationContext.getBean("userService");
        userService.save();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}