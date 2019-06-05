package Dao;

import Dao.Impl.BeanFactoryImpl;

public class BeanFactoryInstance {
    public static BeanFactory GetInstanceStatic(){
        return new BeanFactoryImpl();
    }

    public BeanFactory GetInstance()
    {
        return new BeanFactoryImpl();
    }
}
