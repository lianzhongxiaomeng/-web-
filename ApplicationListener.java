package com.dudu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//@WebListener
public class ApplicationListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("application��������");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("application�����������ˣ����������һЩ��ʼ��������");
	}

}
