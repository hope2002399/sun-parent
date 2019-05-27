package com.feignclient.comfig;

import java.util.concurrent.TimeUnit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Retryer;

@Configuration
public class FeignConfig {
	//在FeignConfig类上加上@Configuration注解，
	//表明这是一个配置类，并注入一个BeanName为feignRetryer的Retryer的Bean。可使feign在远程调用失败后会进行重试。
	    @Bean
	    public Retryer feignRetryer(){
	        return new Retryer.Default(100,TimeUnit.SECONDS.toMillis(1),5);
	    }
}
