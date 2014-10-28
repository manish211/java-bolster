package com.cango.spring.embeddedDataBase.dto;

import com.cango.db.dto.BaseDTO;

/**
 * Created by caoyanfei079 on 7/16/14.
 */
public class CustomerDTO extends BaseDTO {
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}