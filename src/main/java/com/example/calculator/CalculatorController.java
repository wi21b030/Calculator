package com.example.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    /**
     * Does sum calculation
     * @param a int
     * @param b int
     * @return a+b
     */

    //localhost:8080/sum?a=5&b=6 so kann man bspw die Funktion im Browser verwenden
    @RequestMapping("/sum")
    public int sum(@RequestParam int a,@RequestParam int b){
        return a + b;
    }

    @RequestMapping("/sub")
    public int sub(@RequestParam int a,@RequestParam int b){
        return a - b;
    }

    @RequestMapping("/mul")
    public int mul(@RequestParam int a,@RequestParam int b){
        return a * b;
    }

    @RequestMapping("/div")
    public int div(@RequestParam int a,@RequestParam int b){
        if(b != 0){
            return a / b;
        }
        System.out.println("Division durch 0 nicht möglich!");
        return 0;
    }


}
