package com.itheima.domain.FactoryBean;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;


public class StaticFactoryBean {
    /**
     * 静态实例化Bean对象要求工程对象中有静态方法的返回值为想要实例化的对象
     * xml中<bean id="userDo",class="com.itheima.domain.FactoryBean.StaticFactoryBean
                  factory-method="getUserDao"></>
     */
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
    /**
     * 非动态实例化Bean对象,要求工厂类中有非静态的方法返回值为想要实例化的对象
     * 先创建工厂对象
     *<bean id="factory",class="com.itheima.domain.FactoryBean.StaticFactoryBean></>
     * 在创建dao对象
     * <bean id="userDao" factory-bean="factory" factory-method="getUserDao"></bean>
     */
    public UserDao creatUserDao(){
        return new UserDaoImpl();
    }
}
