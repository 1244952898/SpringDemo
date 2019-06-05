package dao;


import dao.Impl.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    @Test
    public void Test() {
        UserDao userDao=new UserDaoImpl();
        userDao.save();
    }

    @Test
    public void Test1() {
        ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("spring/ApplicationContext.xml");
        UserDao dao= (UserDao) applicationContext.getBean("userDao");
        dao.save();
    }
}