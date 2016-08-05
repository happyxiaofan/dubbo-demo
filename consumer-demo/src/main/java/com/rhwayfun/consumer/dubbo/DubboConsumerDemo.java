package com.rhwayfun.consumer.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rhwayfun.service.HelloService;

/**
 * 
 * @ClassName: DubboConsumerDemo 
 * @Description: TODO
 * @author ZhongCB
 * @date 2016年8月5日 下午4:14:58 
 *
 */
public class DubboConsumerDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:application.xml"});
		ctx.start();
		
		// 获取远程服务代理
		HelloService helloservice = (HelloService)ctx.getBean("helloService");
		System.out.println(helloservice.getName());
	}
}
