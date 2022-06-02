package com.example.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    /**
     * does addition
     * @param a int
     * @param b int
     * @return a+b
     */

    //localhost:8080/sum?a=5&b=6 so kann man bspw die Funktion im Browser verwenden

    @RequestMapping("/sum")
    public int sum(@RequestParam int a,@RequestParam int b){
        return a + b;
    }

    /**
     * does subtraction
     * @param a int
     * @param b int
     * @return a-b
     */
    @RequestMapping("/sub")
    public int sub(@RequestParam int a,@RequestParam int b){
        return a - b;
    }

    /**
     * does multiplication
     * @param a int
     * @param b int
     * @return a*b
     */
    @RequestMapping("/mul")
    public int mul(@RequestParam int a,@RequestParam int b){
        return a * b;
    }

    /**
     * does division
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("/div")
    public String div(@RequestParam int a,@RequestParam int b){
        if(b != 0){
            return String.format("%d", a/b);
        }
        return "Division durch 0 nicht möglich";
    }

    /**
     * does multiplication with itself
     * @param a
     * @return
     */
    @RequestMapping("/quad")
    public int quad(@RequestParam int a){
        return a * a;
    }

    /**
     * does multiplication to the power of b
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("/pow")
    public int pow(@RequestParam int a,@RequestParam int b){
        return (int) Math.pow(a,b);
    }

    /**
     * does absolute of number
     * @param a
     * @return
     */
    @RequestMapping("/abs")
    public int abs(@RequestParam int a){
        return Math.abs(a);
    }


}
