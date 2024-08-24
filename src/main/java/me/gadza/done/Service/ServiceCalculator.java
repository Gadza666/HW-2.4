package me.gadza.done.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ServiceCalculator {

    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }

    public String calculateSum(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }
    public String calculateMinus( int num1, int num2) {
        return String.valueOf(num1 - num2);
    }
    public String calculateMultiply( int num1, int num2) {
        return String.valueOf(num1 * num2);
    }
    public String calculateDivide( int num1, int num2) {
        return String.valueOf(num1 / num2);
    }
}
