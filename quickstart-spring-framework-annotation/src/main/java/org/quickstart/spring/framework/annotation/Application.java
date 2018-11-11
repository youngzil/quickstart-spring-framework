/**
 * 项目名称：quickstart-spring-framework 
 * 文件名：Application.java
 * 版本信息：
 * 日期：2017年12月11日
 * Copyright asiainfo Corporation 2017
 * 版权所有 *
 */
package org.quickstart.spring.framework.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Application
 * 
 * @author：youngzil@163.com
 * @2017年12月11日 上午8:35:22
 * @since 1.0
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {

        // 通过注解加载bean的实例的类
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        // MessagePrinter printer = context.getBean(MessagePrinter.class);
        MessagePrinter printer = (MessagePrinter) context.getBean("printer");

        printer.printMessage();

        // 通过类路径加载BEAN的XML方式
        // ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // ApplicationContext context2 = new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml", "Spring-Connection.xml", "Spring-ModuleA.xml"});

        // 通过文件路径加载BEAN的XML方式
        // ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
    }
}
