package dao;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdkProxyTest {
    @Test
    public void TEst() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/ApplicationContext.xml");
        UserService userService= (UserService) applicationContext.getBean("userService");
        JdkProxy proxy=new JdkProxy(userService);
        UserService userServiceProxy =  proxy.CreateProxy();
        userServiceProxy.save();
        userService.add();
        userService.update();
        userService.delete();
    }
}