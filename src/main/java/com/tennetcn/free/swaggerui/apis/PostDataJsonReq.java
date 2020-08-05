package com.tennetcn.free.swaggerui.apis;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author chfree
 * @email chfree001@gmail.com
 * @create 2020-07-22 17:24
 * @comment
 */

public class PostDataJsonReq {
    @ApiModelProperty(value = "用户")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
