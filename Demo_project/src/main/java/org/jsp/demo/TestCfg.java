package org.jsp.demo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCfg {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		System.out.println("File loaded");
		SessionFactory ses = conf.buildSessionFactory();
		System.out.println(ses);
	}
}
