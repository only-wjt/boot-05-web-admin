package com.springboot.admin.test;

import org.springframework.boot.context.properties.PropertyMapper;

import java.util.function.Consumer;

/**
 * @author onlyWjt
 * @date 2022年09月06日 21:31
 * @desc
 */
public class Maintest {
    public static void main(String[] args) {
        PropertyMapper propertyMapper = PropertyMapper.get().alwaysApplyingWhenNonNull();
        TestImp testImp = new TestImp();
        propertyMapper.from("").to(testImp::test);
        Consumer<Test> test = Test::test;
    }
}
