package com.iftm.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculadoraTests {
    
    @Test
    public void testeSoma(){
        Calculadora calc = new Calculadora();
        calc.somar(3);
        int resultado = calc.getMemoria();
        int esperado = 9;
        assertEquals(esperado,resultado);
    }

    @Test
    public void testeSubtracao(){
        Calculadora calc = new Calculadora();
        calc.subtrair(3);
        int resultado = calc.getMemoria();
        int esperado = -3;
        assertEquals(esperado,resultado);
    }

    @Test
    public void testeMultiplicacao(){
        Calculadora calc = new Calculadora();
        calc.multiplicar(3);
        int resultado = calc.getMemoria();
        int esperado = 3;
        assertEquals(esperado,resultado);
    }

    @Test
    public void testeDivisao() throws Exception {
        Calculadora calc = new Calculadora();
        calc.dividir(3);
        int resultado = calc.getMemoria();
        int esperado = 1;
        assertEquals(esperado,resultado);
    }

    @Test
    public void testeExponencial() throws Exception {
        Calculadora calc = new Calculadora();
        calc.exponenciar(3);
        int resultado = calc.getMemoria();
        int esperado = 1;
        assertEquals(esperado,resultado);
    }
}
