package com.example.yuaicoder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.yuaicoder.mapper")
public class YuaicoderApplication {

	public static void main(String[] args) {
		SpringApplication.run(YuaicoderApplication.class, args);
	}

}
