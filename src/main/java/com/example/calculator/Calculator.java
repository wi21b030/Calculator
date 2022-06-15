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

    public String div(int a, int b){
        if(b != 0){
            return String.format("%d", a/b);
        }
        return "Division durch 0 nicht möglich";
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
