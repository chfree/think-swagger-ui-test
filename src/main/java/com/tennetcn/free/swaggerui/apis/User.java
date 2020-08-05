package com.tennetcn.free.swaggerui.apis;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author chfree
 * @email chfree001@gmail.com
 * @create 2020-04-24 22:06
 * @comment
 */

public class User {
    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
