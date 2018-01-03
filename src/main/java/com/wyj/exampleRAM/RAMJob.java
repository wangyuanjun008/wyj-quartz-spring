package com.wyj.exampleRAM;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * RAMJob
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年12月29日 下午10:04:36
 */
public class RAMJob implements Job{
	
	private Logger logger = LoggerFactory.getLogger(RAMJob.class);
	
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.debug("hello world ! hello Quartz - "+new Date());
	}

}
