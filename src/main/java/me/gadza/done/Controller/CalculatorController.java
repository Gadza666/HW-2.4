package me.gadza.done.Controller;

import me.gadza.done.Service.ServiceCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private ServiceCalculator serviceCalculator;

    public CalculatorController(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping
    public String sayHello() {
        return "<b>Добро пожаловать в калькулятор<b>";
    }

    @GetMapping("/plus")
    public String calculateSum(@RequestParam(value = "num1", required = false) Integer num1,
                               @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        return "сумма:[%s]".formatted(serviceCalculator.calculateSum(num1, num2));

    }

    @GetMapping("/minus")
    public String calculateMinus(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        return "разницаЖ[%s]".formatted(serviceCalculator.calculateMinus(num1, num2));
    }

    @GetMapping("/multiply")
    public String calculateMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                                    @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        return "умножение:[%s]".formatted(serviceCalculator.calculateMultiply(num1, num2));
    }

    @GetMapping("/divide")
    public String calculateDivide(@RequestParam(value = "num1", required = false) Integer num1,
                                  @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        if (num2 == 0)
            return "На ноль делить нельзя";
        return "деление:[%s]".formatted(serviceCalculator.calculateDivide(num1, num2));
    }

}
