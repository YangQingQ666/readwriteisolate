package cn.mpy.plustest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.mpy.plustest.mapper")
public class PlustestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlustestApplication.class, args);
    }

}
