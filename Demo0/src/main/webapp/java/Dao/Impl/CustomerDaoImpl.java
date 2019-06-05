package Dao.Impl;

import Dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {
    public void SetUp(){
        System.out.println("SetUpSetUpSetUpSetUp");
    }

    @Override
    public void Runing() {
        System.out.println("Runing");
    }

    @Override
    public void Close() {
        System.out.println("Close");
    }
}
