package com.example.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private Calculator calc = new Calculator();
    /**
     * does addition
     * @param a int
     * @param b int
     * @return a+b
     */

    //localhost:8080/sum?a=5&b=6 so kann man bspw die Funktion im Browser verwenden

    @RequestMapping("/sum")
    public int sum(@RequestParam int a,@RequestParam int b){
        return calc.sum(a,b);
    }

    /**
     * does subtraction
     * @param a int
     * @param b int
     * @return a-b
     */
    @RequestMapping("/sub")
    public int sub(@RequestParam int a,@RequestParam int b){
        return calc.sub(a,b);
    }

    /**
     * does multiplication
     * @param a int
     * @param b int
     * @return a*b
     */
    @RequestMapping("/mul")
    public int mul(@RequestParam int a,@RequestParam int b){
        return calc.mul(a,b);
    }

    /**
     * does division
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("/div")
    public String div(@RequestParam int a,@RequestParam int b){
        return calc.div(a,b);
    }

    /**
     * does multiplication with itself
     * @param a
     * @return
     */
    @RequestMapping("/quad")
    public int quad(@RequestParam int a){
        return calc.quad(a);
    }

    /**
     * does multiplication to the power of b
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("/pow")
    public int pow(@RequestParam int a,@RequestParam int b){
        return calc.pow(a,b);
    }

    /**
     * does absolute of number
     * @param a
     * @return
     */
    @RequestMapping("/abs")
    public int abs(@RequestParam int a){
        return calc.abs(a);
    }


}
