package cn.ryanray.ryan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;

@Configuration
public class Knife4jConfig {

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.OAS_30) // 使用 OpenAPI 3.0
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("cn.ryanray.ryan.controller")) // 指定扫描的包路径
//                .paths(PathSelectors.any())
//                .build();
//    }

    @Bean
    public Docket api() {
        ParameterBuilder tokenParam = new ParameterBuilder();
        tokenParam.name("Authorization") // 参数名
                .description("认证 Token") // 参数描述
                .modelRef(new ModelRef("string")) // 参数类型
                .parameterType("header") // 参数位置（header、query、path 等）
                .required(false) // 是否必填
                .build();

        return new Docket(DocumentationType.OAS_30)
                .globalOperationParameters(Arrays.asList(tokenParam.build())) // 添加全局参数
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.ryanray.ryan.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot 3 集成 Knife4j") // 文档标题
                .description("Spring Boot 3 集成 Knife4j 示例") // 文档描述
                .version("1.0.0") // 文档版本
                .build();
    }
}