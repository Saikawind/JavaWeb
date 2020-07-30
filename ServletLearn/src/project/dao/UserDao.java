package project.dao;

import project.domain.User;

import java.util.List;

/**
 * @Description: 用户操作DAO接口
 * @Author: Wang Shiyu
 * @Date: 2020/7/29/22:29
 */
public interface UserDao {

    public List<User> findAll();

    public User findUserByUsernameAndPassword(String username, String password);
}
