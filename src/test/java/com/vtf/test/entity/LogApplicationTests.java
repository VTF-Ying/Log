package com.vtf.test.entity;


import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Supplier;

@SpringBootTest
class LogApplicationTests {
    // 日志对象
    Logger logger = LoggerFactory.getLogger(LogApplicationTests.class);

    @Test
	void contextLoads() {
        logger.trace("trace*****");
        logger.debug("debug*****");
        logger.info("info*****");
        logger.warn("warn*****");
        logger.error("error*****");

	}

}
