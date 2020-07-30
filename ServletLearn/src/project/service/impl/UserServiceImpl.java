package project.service.impl;

import project.dao.UserDao;
import project.dao.impl.UserDaoImpl;
import project.domain.User;
import project.service.UserService;

import java.util.List;

/**
 * @Description: 用户管理业务实现类
 * @Author: Wang Shiyu
 * @Date: 2020/7/29/22:27
 */
public class UserServiceImpl implements UserService {

    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        // 调用Dao完成查询
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
}
