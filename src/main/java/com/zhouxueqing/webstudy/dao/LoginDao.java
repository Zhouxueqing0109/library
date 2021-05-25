package com.zhouxueqing.webstudy.dao;




import com.zhouxueqing.webstudy.bean.Admin;
import com.zhouxueqing.webstudy.bean.User;
import com.zhouxueqing.webstudy.utils.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    public User selectOne(String username) {
        User user = null;
        try (ResultSet resultSet =
                     JDBCUtil.getInstance().executeQueryRS("select " +
                                     "* " +
                                     "from " +
                                     "borrow_card where username=?",
                             new Object[]{username})) {

            while (resultSet.next()) {
                user = new User(resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("reader"),
                        resultSet.getString("header"),
                        resultSet.getString("cellphone"),
                        resultSet.getString("email"),
                        resultSet.getString("describe"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public Admin selectOne(String username, String password) {
        Admin admin = null;
        try (ResultSet resultSet =
                     JDBCUtil.getInstance().executeQueryRS("select " +
                                     "* " +
                                     "from " +
                                     "admin where username=?",
                             new Object[]{username})) {

            while (resultSet.next()) {
                admin = new Admin(resultSet.getString("username"),
                        resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return admin;
    }
}