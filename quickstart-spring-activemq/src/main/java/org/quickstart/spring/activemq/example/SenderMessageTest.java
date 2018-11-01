/**
 * 项目名称：quickstart-spring-framework-activemq 
 * 文件名：SenderMessageTest.java
 * 版本信息：
 * 日期：2018年11月1日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.spring.activemq.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SenderMessageTest 
 *  
 * @author：yangzl@asiainfo.com
 * @2018年11月1日 下午4:13:55 
 * @since 1.0
 */
public class SenderMessageTest {
    
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("example/applicationContext.xml");
        MessageSender sender=(MessageSender)context.getBean("sender");
        String text="test";
        sender.sendMessage(text);
        System.out.println("send....");
    }

}
