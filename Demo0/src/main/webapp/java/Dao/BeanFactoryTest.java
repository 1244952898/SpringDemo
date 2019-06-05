package Dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BeanFactoryTest {
    @Test
    public void TestStatic() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory beanFactory = (BeanFactory) applicationContext.getBean("BeanFacStatic");
        beanFactory.Test();
    }

    @Test
    public void Test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory beanFactory = (BeanFactory) applicationContext.getBean("BeanFac");
        beanFactory.Test();
    }
}