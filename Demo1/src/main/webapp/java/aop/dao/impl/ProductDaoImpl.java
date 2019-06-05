package aop.dao.impl;

import aop.dao.ProductDao;

public class ProductDaoImpl implements ProductDao {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void del() {
        System.out.println("del");
        int i=1/0;
    }

    @Override
    public String update() {
        System.out.println("update");
        return "update 返回值";
    }

    @Override
    public void select() {
        System.out.println("select");

    }
}
