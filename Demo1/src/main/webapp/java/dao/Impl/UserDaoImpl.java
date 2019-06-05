package dao.Impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    private String Name;

    @Value("abcdef")
    public void setName(String name) {
        Name = name;
    }

    @Override
    public void save() {
        System.out.println("UserDaoImpl.save_" + Name);
    }
}
