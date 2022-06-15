package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void sumTest(){
        //Arrange
        int c = 5;
        int d = 6;
        int expected = 11;
        //Act
        int result = calculator.sum(c,d);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void sumTest2(){
        assertEquals(42, calculator.sum(40,2));
    }

    @Test
    void subTest(){
        int c = 5;
        int d = 6;
        int expected = -1;
        //Act
        int result = calculator.sub(c,d);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void mulTest(){
        int c = 5;
        int d = 6;
        int expected = 30;
        //Act
        int result = calculator.mul(c,d);
        //Assert
        assertEquals(expected,result);
    }
    /*
    @Test
    void div(){
        int c = 5;
        int d = 0;
    }*/
    @Test
    void quadTest(){
        int c = 5;
        int expected = 25;
        //Act
        int result = calculator.quad(c);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void powTest(){
        int c = 5;
        int d = 3;
        int expected = 125;
        //Act
        int result = calculator.pow(c,d);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void absTest(){
        int c = 5;
        int expected = 5;
        //Act
        int result = calculator.abs(c);
        //Assert
        assertEquals(expected,result);
    }

}