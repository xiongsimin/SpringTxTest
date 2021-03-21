package kim.aries.service.impl;

import kim.aries.mapper.UserMapper;
import kim.aries.modal.User;
import kim.aries.service.UserService;
import kim.aries.utils.SpringBeanUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author aries
 * @Data 2021-03-20
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Transactional
    public void insertTwoUser() {
        User user1 = new User("zhangsan", 20);
        User user2 = new User("lisi", 21);
        UserService userService = SpringBeanUtil.getBean(UserService.class);
        userService.insertUser(user1);
        userService.insertUserException(user2);
        int i = 2 / 0;
    }

    @Transactional
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Transactional
    public void insertUserException(User user) {
        userMapper.insertUser(user);
        int i = 1 / 0;
    }
}
