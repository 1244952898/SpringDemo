package Dao.Impl;

import Dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String name;

    public UserDaoImpl(String name) {
        this.name = name;
    }

    @Override
    public void GetData() {
        System.out.println("GetData"+name);
    }
}
