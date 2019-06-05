package Dao.Impl;

import Dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

    @Test
    public void getData(){
        UserDao dao=new UserDaoImpl("1");
        dao.GetData();
    }
    @Test
    public void getData1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
         UserDao userDao= (UserDao) applicationContext.getBean("userDao");
         userDao.GetData();
    }
}