package com.dodo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//扩展springmvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//
//    //装配在springIoc容器中
//    //ViewResolver 实现了视图解析器接口的类 我们就可以把它看作视图解析器
//    @Bean
//    public ViewResolver myViewResolver(){
//        return new MyViewResolver();
//    }
//o
//
//
//
//    //自定义一个自己的视图解析器MyViewResolver
//    public static class MyViewResolver implements ViewResolver{
//
//        @Override
//        public View resolveViewName(String viewName, Locale locale) throws Exception {
//            return null;
//        }
//    }

    //视图控制
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
    }

    //自定义国际化解析器
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }



}