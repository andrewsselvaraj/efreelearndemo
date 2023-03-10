package com.efreelearn;

import java.lang.reflect.AnnotatedType;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;



//import com.efreelearn.routingandfilteringgateway.filters.pre.SimpleFilter;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;





@SpringBootApplication
public class Application {
	
	   @Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.efreelearn.restcontroller")).build();
	   }
	  

    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        
        String[] beanNames = ctx.getBeanDefinitionNames();
     
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        	AnnotatedType annotatedType[] =  ctx.getBean(beanName).getClass().getAnnotatedInterfaces();
        	for ( int i=0;i<annotatedType.length;i++ )
        	{
        	//System.out.println( i+" "+annotatedType[i].toString() );
        	}

        }
    
      

        
        
        
    }

}



