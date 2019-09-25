package cn.tcmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.tcmp.dao")
@SpringBootApplication
public class UserProvierApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProvierApplication.class, args);
    }

}
