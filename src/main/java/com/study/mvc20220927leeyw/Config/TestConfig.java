package com.study.mvc20220927leeyw.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    // 클래서 생성해서 리턴해서 ioc에 들어간다
    @Bean
    public TestSetting testSetting() {
        return new TestSetting();
    }

}
