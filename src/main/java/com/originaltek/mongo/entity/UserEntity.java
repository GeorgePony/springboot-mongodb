package com.originaltek.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 15:29
 * @todo 用户实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -1291951355149691603L;
    private Long id;
    private String userName;
    private String passWord;
}
