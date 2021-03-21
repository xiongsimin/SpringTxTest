package kim.aries.controller;

import kim.aries.modal.User;
import kim.aries.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author aries
 * @Data 2021-03-20
 */
@RestController
@RequestMapping(value = "/tx")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public void insertUser() {
        userService.insertTwoUser();
    }
}
