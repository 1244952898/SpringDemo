package demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/ApplicationContext.xml")
public class Demo4Test {
    @Resource(name = "orderDao")
    private OrderDao orderDao;
    @Test
    public void Test(){
        orderDao.add();
        orderDao.del();
        orderDao.upd();
        orderDao.sel();
    }
}
