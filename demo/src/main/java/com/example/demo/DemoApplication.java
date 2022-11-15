package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[]args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/suma")
	public int suma(@RequestParam(value="a") int num1,@RequestParam(value = "b") int num2) {
		return num1 + num2;
	}

	@GetMapping("/resta")
	public int resta(@RequestParam(value="a") int num1,@RequestParam(value = "b") int num2) {
		return num1 - num2;
	}

	@GetMapping("/multiplicacion")
	public int multiplicacion(@RequestParam(value="a") int num1,@RequestParam(value = "b") int num2) {
		return num1 * num2;
	}

	@GetMapping("/division")
	public int division(@RequestParam(value="a") int num1,@RequestParam(value = "b") int num2) {
		return num1 / num2;
	}

	@GetMapping("/cuadratica")
	public double[] cuadratica(@RequestParam(value="a") int a,@RequestParam(value = "b")int b,@RequestParam(value = "c")int c) {
		if(a ==0 || b == 0)  { throw new ArithmeticException(); }

		double preMasMenos = Math.sqrt((b * b) - (4 * a * c));
		double postMasMenosPositivo = (-b + preMasMenos)/2*a;
		double postMasMenosNegativo = (-b - preMasMenos)/2*a;

		double[] resultado = {postMasMenosPositivo,postMasMenosNegativo};
		return resultado;

	}
}