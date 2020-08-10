package com.tennetcn.free.swaggerui.apis;

import com.tennetcn.free.core.message.web.BaseResponse;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public PostDataJsonResp postDataJson(@RequestBody @ApiParam(value = "req对象") PostDataJsonReq req){
        PostDataJsonResp resp = new PostDataJsonResp();
        BeanUtils.copyProperties(req,resp);

        return resp;
    }

    @PostMapping("postDataJson1")
    public PostDataJsonResp1 postDataJson1(@RequestBody @ApiParam(value = "req1对象") PostDataJsonReq1 req){
        PostDataJsonResp1 resp = new PostDataJsonResp1();
        BeanUtils.copyProperties(req,resp);

        return resp;
    }

    @PostMapping("pathTest/{name}/{age}")
    public BaseResponse pathTest(@PathVariable("name")String name,@PathVariable("age") int age){
        BaseResponse resp = new BaseResponse();
        resp.put("name",name);
        resp.put("age",age);

        return resp;
    }
}
