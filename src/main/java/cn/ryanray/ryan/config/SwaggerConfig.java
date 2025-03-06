//package cn.ryanray.ryan.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.OAS_30) // 使用 OpenAPI 3.0
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("cn.ryanray.ryan.controller")) // 指定扫描的包路径
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Spring Boot 集成 Swagger") // 文档标题
//                .description("Spring Boot 集成 Swagger 示例") // 文档描述
//                .version("1.0.0") // 文档版本
//                .build();
//    }
//}