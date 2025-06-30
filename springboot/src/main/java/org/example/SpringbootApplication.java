package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;


@SpringBootApplication
@MapperScan("org.example.mapper")
public class SpringbootApplication {

	public static void main(String[] args) {
		// 验证驱动是否已注册到DriverManager
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		while (drivers.hasMoreElements()) {
			System.out.println("✅ 系统已注册驱动: " + drivers.nextElement().getClass().getName());
		}

		SpringApplication.run(SpringbootApplication.class, args);
	}
}
