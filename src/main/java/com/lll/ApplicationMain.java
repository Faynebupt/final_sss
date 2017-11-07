package com.lll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by qaa on 2017/7/10.
 */
@SpringBootApplication
public class ApplicationMain {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(ApplicationMain.class);
//    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationMain.class, args);
    }

}
