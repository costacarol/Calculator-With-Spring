package io.github.costacarol.annotation.app;

import io.github.costacarol.annotation.model.OperationType;
import io.github.costacarol.annotation.service.CalculatorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CalculatorService calculatorService = (CalculatorService) applicationContext.getBean("calculatorService");
        calculatorService.execute(OperationType.SUM, 2.0, 2.5);
        calculatorService.execute(OperationType.SUB, 2.0, 2.5);
        calculatorService.execute(OperationType.MULTIPLY, 2.0, 2.5);
        calculatorService.execute(OperationType.DIVISION, 2.0, 2.5);
        calculatorService.execute(OperationType.POW, 2.0, 2.5);
        try {
            calculatorService.execute(OperationType.SUM, calculatorService.getResultOfRealizedOperation(1), 2.5);
        }catch (IndexOutOfBoundsException e){
            throw new IllegalArgumentException("Invalid parameter: insert a existent index to search the result.");
        }
        applicationContext.close();
    }
}
