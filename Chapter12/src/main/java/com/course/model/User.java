package com.course.model;

/**
 * 跟数据库里的表字段一致，和数据库映射
 */

import lombok.Data;

@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;

    public String toString(){
        return (
            "{id:"+ id + "," +
            "userName:" + userName + "," +
            "password:" + password + "," +
            "age:" + age + "," +
            "sex:"+ sex + "," +
            "permission:" + permission + "," +
            "isDelete:" + isDelete + "}"
        );
    }

}
