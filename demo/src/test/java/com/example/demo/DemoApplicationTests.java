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

	DemoApplication calculadora = new DemoApplication();

	@Test
	public void suma() {
		assertEquals(calculadora.suma(1, 2), 3);
	}

	@Test
	public void suma2() {
		assertNotEquals(calculadora.suma(4, 1), 3);
	}

	@Test
	public void resta() {
		assertEquals(calculadora.resta(5, 2), 3);
	}

	@Test
	public void resta2() {
		assertNotEquals(calculadora.resta(3, 1), 3);
	}

	@Test
	public void multiplicacion() {
		assertEquals(calculadora.multiplicacion(5, 2), 10);
	}

	@Test
	public void multiplicacion2() {
		assertNotEquals(calculadora.multiplicacion(4, 1), 3);
	}

	@Test
	public void division() {
		assertEquals(calculadora.division(6, 2), 3);
	}

	@Test
	public void division2() {
		assertNotEquals(calculadora.division(6, 2), 4);
	}

	@Test
	public void divisionException() {
		Assertions.assertThrows(ArithmeticException.class, ()->{
			calculadora.division(1, 0);
		});
	}

	@Test
	public void raizCuadratica(){
		assertArrayEquals(calculadora.cuadratica(1, 2, -8), new double[]{2, -4});
	}

	@Test
	public void raizCuadratica2(){
		assertNotEquals(calculadora.cuadratica(1, 2, 80), new double[]{2, -4});
	}

	@Test
	public void raizCuadraticaException(){
		Assertions.assertThrows(ArithmeticException.class, ()->{
			calculadora.cuadratica(1, 0, -8);
			calculadora.cuadratica(0, 2, -8);
		});
	}