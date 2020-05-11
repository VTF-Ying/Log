package com.vtf.test.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
/**
 * @ProjectName: Log
 * @ClassName: User
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-11 14:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    private Long id;
    private String name;
    private Integer age;
    private String email;
    private java.util.Date createTime;
    private java.util.Date updateTime;
    private Integer version;
    private Integer deleted;
}
