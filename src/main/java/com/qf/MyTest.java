package com.qf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by DELL on 2019/5/28.
 */
public class MyTest {
    //定义一个日志记录对象
    public static final Logger logger = LoggerFactory.getLogger(MyTest.class);
    public static void main(String[] args) {
        //使用日志记录对象进行info输出
        logger.info("slf4j for info");
        //使用日志记录对象进行debug输出
        logger.debug("slf4j for debug");
        //使用日志记录对象进行error输出
        logger.error("slf4j for error");
        //使用日志记录对象进行warn输出
        logger.warn("slf4j for warn");

        String message = "Hello SLF4J";
        logger.info("slf4j message is : {}", message);
    }

}
