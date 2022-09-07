package com.springboot.admin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.EventListener;

/**
 * @author onlyWjt
 * @date 2022年09月04日 17:06
 * @desc
 */
@Slf4j
@WebListener
public class MyservlertContextLister implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("监听项目完成");
        ServletContextListener.super.contextInitialized(sce);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("监听项目销毁");
        ServletContextListener.super.contextDestroyed(sce);
    }
}
