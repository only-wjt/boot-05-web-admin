package com.springboot.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author onlyWjt
 * @date 2022年05月03日 17:47
 * @desc
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private String userName;
    private String passWord;
}
