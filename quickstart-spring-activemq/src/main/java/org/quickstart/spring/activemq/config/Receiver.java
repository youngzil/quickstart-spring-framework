/**
 * 项目名称：quickstart-spring-framework-activemq 
 * 文件名：Receiver.java
 * 版本信息：
 * 日期：2018年10月30日
 * Copyright asiainfo Corporation 2018
 * 版权所有 *
 */
package org.quickstart.spring.activemq.config;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * Receiver
 * 
 * @author：youngzil@163.com
 * @2018年10月30日 下午4:21:14
 * @since 1.0
 */
public class Receiver {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-beans.xml");

        // ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext-*.xml");

        JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");
        while (true) {
            Map<String, Object> map = (Map<String, Object>) jmsTemplate.receiveAndConvert();

            System.out.println("收到消息：" + map.get("message"));
        }
    }
}
