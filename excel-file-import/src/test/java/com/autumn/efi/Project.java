package com.autumn.efi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.autumn.efi.dao.UserDao;
import com.autumn.efi.services.UserService;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-ds.xml" })
// @TransactionConfiguration(transactionManager = "transactionManagerInshopHoldProduct", defaultRollback = true)
public class Project extends AbstractTransactionalJUnit4SpringContextTests {

	// @Autowired
	// private UserService userService;

	@Autowired
	private UserDao userDao;

	@Test
	public void testInsert() {
		System.out.println("----------");
		// try {
		// userService.insertUserInfo();
		// int i = userDao.insert(new User(2, "老王", "123", 11));
		// System.out.println("------>" + i);
		// ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:spring-ds.xml");
		// DruidDataSource druidDataSource = (DruidDataSource) ac.getBean("dataSource");
		// System.out.println("------------>" + druidDataSource.getUrl());
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
	}
}
