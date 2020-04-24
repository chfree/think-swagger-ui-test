package com.tennetcn.free.swaggerui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author chfree
 * @email chfree001@gmail.com
 * @create 2020-04-24 18:55
 * @comment
 */

@EnableSwagger2
@SpringBootApplication
public class SwaggerUIApp {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerUIApp.class);
    }
}
