package com.dodo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

// 等价与<bean id="user" class="com.dodo.pojo.User" />
// Component 组件
@Component
public class User {
    @Value("JackyWang")
    public String name ;

}