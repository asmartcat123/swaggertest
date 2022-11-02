package com.example.springboot.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("显示的标题").description("标题描述").build();
    }
    @Bean  //Swagger的使用主要是要将docket对象传入IOC容器
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true) //使Swagger生效
                .groupName("Test")
                .select()//选择扫描的接口
                .apis(RequestHandlerSelectors.basePackage("com.example.springboot.Controller"))//指定扫描的接口
                .build()
                .apiInfo(apiInfo());
    }



}