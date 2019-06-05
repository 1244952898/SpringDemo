package Dao.Impl;

import Dao.CustomerDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CustomerDaoImplTest {

    @Test
    public void Test() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao dao= (CustomerDao) applicationContext.getBean("customerDao");
        dao.Runing();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }

}