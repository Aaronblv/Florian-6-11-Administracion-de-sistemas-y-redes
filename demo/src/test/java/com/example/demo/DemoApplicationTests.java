package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

	DemoApplication calc = new DemoApplication();

	@Test
	void contextLoads() {
	}

	@Test
	void sumar() {

		assertEquals(calc.suma(1,4),3);
		assertNotEquals(calc.suma(1,4),4);
	}

	@Test
	public void shouldThrowException() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calc.division(1, 0);
		});

	}
}