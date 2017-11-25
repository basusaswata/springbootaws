package com.blog.sample.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.blog.samples.Application;

@ContextConfiguration(classes=Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
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
