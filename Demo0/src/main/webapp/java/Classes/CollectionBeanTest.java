package Classes;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CollectionBeanTest {
    @Test
    public void Test() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CollectionBean bean= (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(bean);
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}