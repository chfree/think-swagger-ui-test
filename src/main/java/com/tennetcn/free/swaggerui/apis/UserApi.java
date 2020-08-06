package com.tennetcn.free.swaggerui.apis;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    @PostMapping(value = "test")
    public Object test(User user0){
        User user = new User();
        user.setAge(18);
        user.setName("chfree");

        return user;
    }

    @PostMapping(value = "test1")
    public User test1(@RequestBody @ApiParam(value = "用户") User user0){
        User user = new User();
        user.setAge(18);
        user.setName("chfree");

        return user;
    }

    @PostMapping("postData")
    public Object postData(@ApiParam(value = "用户名")String userName, String password){
        Map<String,String> result = new HashMap<>();
        result.put("userName",userName);
        result.put("password",password);

        return result;
    }

    @PostMapping("postDataJson")
    public Object postDataJson(@RequestBody @ApiParam(value = "req对象") PostDataJsonReq req){
        Map<String,Object> result = new HashMap<>();
        result.put("req",req);

        return result;
    }

    @PostMapping("postDataJson1")
    public Object postDataJson1(@RequestBody @ApiParam(value = "req1对象") PostDataJsonReq1 req){
        Map<String,Object> result = new HashMap<>();
        result.put("req",req);

        return result;
    }
}
