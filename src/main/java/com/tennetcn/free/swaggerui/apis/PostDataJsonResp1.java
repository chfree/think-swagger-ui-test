package com.tennetcn.free.swaggerui.apis;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author chfree
 * @email chfree001@gmail.com
 * @create 2020-08-06 22:14
 * @comment
 */

public class PostDataJsonResp1 {
    @ApiModelProperty(value = "用户")
    private User user;

    @ApiModelProperty(value = "测试")
    private String test;

    @ApiModelProperty(value = "用户id集合")
    private List<String> ids;

    @ApiModelProperty(value = "用户名称数组")
    private String[] names;

    @ApiModelProperty(value = "用户数组")
    private List<User> users;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
