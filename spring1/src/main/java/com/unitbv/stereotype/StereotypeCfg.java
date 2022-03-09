package com.unitbv.stereotype;

import com.unitbv.stereotype.model.User;
import com.unitbv.stereotype.util.UserUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.unitbv")
public class StereotypeCfg {
    @Bean
    UserUtil userUtil() {
        return new UserUtil();
    }
}
