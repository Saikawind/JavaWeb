package project.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import project.dao.UserDao;
import project.domain.User;
import project.util.JDBCUtils;

import java.util.List;

/**
 * @Description: 用户操作DAO实现类
 * @Author: Wang Shiyu
 * @Date: 2020/7/29/22:29
 */
public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        // 使用JDBC操作数据库
        // 1.定义sql
        String sql = "SELECT * FROM user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        try {
            // 定义sql
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);

            return user;
        } catch (Exception e) {
            return null;
        }
    }
}