package config;

import configure.InterceptorConfig;
import handler.ResponseResultHandler;
import handler.ResponseResultInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@ClassName MyResponseAutoConfiguration
 *@Description TODO
 *@Author DL
 *@Date 2019/7/19 14:44    
 *@Version 1.0
 */
@Configuration
@EnableConfigurationProperties(MyResponseProperties.class)
public class MyResponseAutoConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "dl.response",name="enabled",havingValue = "true")
    public ResponseResultInterceptor responseResultInterceptor(){

    return new ResponseResultInterceptor();

    }
    @ConditionalOnBean(ResponseResultInterceptor.class)
    @Bean
    public InterceptorConfig interceptorConfig(){
    return  new InterceptorConfig();
    }
    @ConditionalOnBean(ResponseResultInterceptor.class)
    @Bean
    public ResponseResultHandler responseResultHandler(){
        return new ResponseResultHandler();
    }



}
