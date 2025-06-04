package com.dummy.HelloWorld;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void testAppMain() {
		// Test that the main method doesn't throw exceptions
		HelloWorldApplication.main(new String[] {});
		assertTrue(true); // If it reaches here, it didn't crash
	}

}
