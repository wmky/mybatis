package com.example.mybatis.entity;

import java.io.Serializable;

/**
 * Created by wmky_kk on 2017/3/5.
 */
public class UserGroupCrit implements Serializable {
    private static final long serialVersionUID = -7811472528778714142L;
    private Long id;
    private Long group_id;
    private String name;
    private String value;

    public UserGroupCrit(){}

    /**
     * UserGroupCrit2 Constructor
     * @param id   primary id 自增ID
     * @param group_id 群组ID
     * @param name 标签名称
     * @param value 标签值
     */
    public UserGroupCrit(long id,long group_id,String name,String value){
        this.id = id;
        this.group_id = group_id;
        this.name = name;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "UserGroupCrit{" +
                "id=" + id +
                ", group_id=" + group_id +
                ", name='" + name  + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

