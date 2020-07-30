package project.service;

import project.domain.User;

import java.util.List;

/**
 * @Description: 用户管理的业务接口
 * @Author: Wang Shiyu
 * @Date: 2020/7/29/22:24
 */
public interface UserService {

    // 查询所有用户信息
    public List<User> findAll();


    public User login(User user);
}
