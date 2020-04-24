package com.tennetcn.free.swaggerui.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chfree
 * @email chfree001@gmail.com
 * @create 2020-04-24 22:05
 * @comment
 */

@RestController
@RequestMapping(value = "/user/")
public class UserApi {
    @GetMapping(value = "index")
    public String hello(){
        return "hello";
    }

    @GetMapping(value = "test")
    public Object test(){
        User user = new User();
        user.setAge(18);
        user.setName("chfree");

        return user;
    }
}
