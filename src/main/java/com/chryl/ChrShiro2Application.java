package com.chryl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chryl.mapper")
public class ChrShiro2Application {

	public static void main(String[] args) {
		SpringApplication.run(ChrShiro2Application.class, args);
	}

}
