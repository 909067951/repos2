package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {

    private List<User> userList;
    private List<String> stringList;
    private Map<String,String> stringMap;
    private Map<String,User> userMap;
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }


    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public void save() {
        System.out.println("UserDaoImpl创建了");
    }
    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "userList=" + userList +
                ", stringList=" + stringList +
                ", stringMap=" + stringMap +
                ", userMap=" + userMap +
                ", properties=" + properties +
                '}';
    }

}
