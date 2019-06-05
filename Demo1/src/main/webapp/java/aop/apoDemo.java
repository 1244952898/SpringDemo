package aop;

import aop.dao.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/ApplicationContext.xml")
public class apoDemo {
    @Resource(name = "productDao")
    private ProductDao productDao;

    @Test
    public void TestDemo(){
        productDao.add();
        productDao.del();
        productDao.update();
        productDao.select();
    }
}
