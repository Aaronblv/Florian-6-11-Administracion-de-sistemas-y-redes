package calculadoraTest;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadoraa.calculadora;

import java.lang.reflect.Array;

public class calculadoraTest {

    calculadora calculator = new calculadora();

    @Test
    public void prueba(){
        calculator.raizCuadratica(2, 0, 3);
    }

    @Test
    public void sumaTest() {
        assertEquals(calculator.sumar(1, 2), 3);
    }

    @Test
    public void sumaTest2(){
        assertNotEquals(calculator.sumar(4, 1), 3);
    }

    @Test
    public void restarTest() {
        assertEquals(calculator.restar(5, 2), 3);
    }

    @Test
    public void restarTest2(){
        assertNotEquals(calculator.restar(3, 1), 3);
    }

    @Test
    public void multiplicarTest(){
        assertEquals(calculator.multiplicar(5, 2), 10);
    }

    @Test
    public void multiplicarTest2(){
        assertNotEquals(calculator.multiplicar(4, 1), 3);
    }

    @Test
    public void dividirTest(){
        assertEquals(calculator.dividir(6, 2), 3);
    }

    @Test
    public void dividirTest2(){
        assertNotEquals(calculator.dividir(6, 2), 4);
    }

    @Test(expected = ArithmeticException.class)
    public void dividirExceptionTest(){
        calculator.dividir(1,0);
    }

    @Test
    public void raizCuadraticaTest(){
        assertArrayEquals(calculator.raizCuadratica(1, 2, -8), new double[] {2, -4}, 0);
    }

    @Test
    public void raizCuadraticaTest2(){
        assertNotEquals(calculator.raizCuadratica(1, 2, 80), new double[] {2, -4});
    }
    @Test(expected = ArithmeticException.class)
    public void raizCuadraticaException(){
        calculator.raizCuadratica(1, 0, -8);
        calculator.raizCuadratica(0, 2, -8);
    }
}