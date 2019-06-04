package cn.javabs.service.impl;

import cn.javabs.dao.UserDao;
import cn.javabs.dao.impl.UserDaoImpl;
import cn.javabs.service.UserService;
import cn.javabs.entity.User;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();
    @Override
    public int addUser(User u) {
        System.out.println("u2="+u);
        int result=userDao.addUser(u);
        return result;
    }
}
