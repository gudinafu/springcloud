package com.imooc.order;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableFeignClients(basePackages = "com.imooc.product.client")
@SpringCloudApplication
@ComponentScan(basePackages = "com.imooc")
@EnableSwagger2
public class  OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}
}
