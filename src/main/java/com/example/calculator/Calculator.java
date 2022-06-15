package com.example.calculator;

public class Calculator {
    public int sum(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Division by Zero Exception!");
        }
        return a/b;
    }

    public int quad(int a){
        return a*a;
    }

    public int pow(int a, int b){
        return (int)Math.pow(a,b);
    }

    public int abs(int a){
        return Math.abs(a);
    }
}
