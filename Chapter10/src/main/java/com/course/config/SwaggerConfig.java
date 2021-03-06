package com.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//加载配置文件专门的标签
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    //以下是固定的
    public Docket api(){
        //Docket(具体方法的实现)
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")                //配置访问路径
                .select()                //选择目录
                .paths(PathSelectors.regex("/.*"))   //选择器加正则匹配
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("我的接口文档")
                .contact(new Contact("xueyaoping","","13096672190@163.com"))
                .description("这是我的swaggerui生成的接口文档")
                .version("1.0.0.0")
                .build();
    }
}
