package cn.mpy.readwriteisolate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.mpy.readwriteisolate.dao")
public class ReadwriteisolateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadwriteisolateApplication.class, args);
    }

}
