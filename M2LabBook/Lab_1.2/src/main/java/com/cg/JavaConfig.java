package com.cg;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:emp.properties")
@ComponentScan("com.cg")
@Configuration
public class JavaConfig {

}





