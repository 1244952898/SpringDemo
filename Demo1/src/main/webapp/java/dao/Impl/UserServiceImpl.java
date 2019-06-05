package dao.Impl;

import dao.UserDao;
import dao.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
//    @Autowired()
//    @Qualifier("userDao")
    @Resource(name = "userDao" )
    private UserDao userDao;
    @Override
    public void save() {
        System.out.println("UserServiceImpl.save");
        userDao.save();
    }

    @Override
    public void add() {
        System.out.println("UserServiceImpl.add");
    }

    @Override
    public void update() {
        System.out.println("UserServiceImpl.update");
    }

    @Override
    public void delete() {
        System.out.println("UserServiceImpl.delete");
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("initMethod");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destory");
    }
}
