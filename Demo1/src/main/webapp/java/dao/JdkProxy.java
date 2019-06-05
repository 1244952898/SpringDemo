package dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler{

    private UserService userService;

    public JdkProxy(UserService userService) {
        this.userService = userService;
    }

    public UserService CreateProxy(){
        UserService userServiceProxy= (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),userService.getClass().getInterfaces(),this);
        return userServiceProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       if ("save".equals(method.getName())){
           System.out.println("Proxy-Save");
       }
       return method.invoke(userService,args);
    }
}
