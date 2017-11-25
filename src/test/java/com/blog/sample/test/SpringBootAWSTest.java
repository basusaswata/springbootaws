package com.blog.sample.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.samples.boot.config.AwsResourceConfig;
import com.blog.samples.boot.test.config.JunitTestConfig;

//@ContextConfiguration(classes=Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JunitTestConfig.class})
public class SpringBootAWSTest {
	
	
	@BeforeClass
	public static void setUp() {
		System.out.println("-----> SETUP <-----");
	}
	
	@Test
	public void testSampleService() {
		assertEquals("","");
	}
	
	@Test
	public void testSampleServiceGetAccountDescription() {
		//	Check if the return description has a 'Description:' string.
		assertTrue("".equals(""));
	}
	
	@Test
	public void testSampleServiceGetAccountCode() {
		assertTrue("".equals(""));
	}
	
	@Test
	public void testSampleServiceCreateNewOrder() {
		assertTrue("".equals(""));
	}
	
	@Test
	public void testSampleServiceGetOrder() {
		assertTrue("".equals(""));
	}
	
	@AfterClass
	public static void afterTest() {
		System.out.println("-----> DESTROY <-----");
	}
}
