package cn.tcmp.first;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tcmp.first.dao")
public class EduProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduProviderApplication.class, args);
    }

}
