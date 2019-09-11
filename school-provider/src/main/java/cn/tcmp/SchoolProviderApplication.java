package cn.tcmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tcmp.dao")
public class SchoolProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolProviderApplication.class, args);
    }

}
