package cn.javabs.dao.impl;


import cn.javabs.department.util.DbcpUtil;
import org.apache.commons.dbutils.QueryRunner;
import cn.javabs.dao.UserDao;
import cn.javabs.entity.User;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    QueryRunner qr = new QueryRunner(DbcpUtil.getDataSource());

    @Override
    public int addUser(User u) {
        System.out.println("u3="+u);

        try {
            int r =  qr.update("insert into user(username,password,sex) values (?,?,?)", u.getUsername(), u.getPassword(), u.getSex());
            System.out.println("r="+r);
            return r;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}