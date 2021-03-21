package kim.aries.service;

import kim.aries.modal.User;

/**
 * @Author aries
 * @Data 2021-03-20
 */
public interface UserService {
    void insertTwoUser();

    void insertUser(User user);

    void insertUserException(User user);
}
