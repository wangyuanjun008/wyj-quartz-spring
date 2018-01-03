package com.wyj.exampleRAM;

import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * RAMtest
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年12月29日 下午10:05:07
 */
public class RAMQuartzTest {

	public static void main(String[] args) throws SchedulerException {
	    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-quartz.xml");
	}
	

}
