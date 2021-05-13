package io.github.costacarol.annotation.service;

import io.github.costacarol.annotation.model.Operation;
import io.github.costacarol.annotation.model.OperationType;
import io.github.costacarol.annotation.command.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorService{

    private final List<Operation> operationsHistory = new ArrayList<>();

    @Autowired
    public ApplicationContext applicationContext;

    public CalculatorService() {
    }

    @Required
    public double execute(OperationType operation, double value1, double value2) {
        if (value2 == 0 && operation.equals(OperationType.DIVISION)) {
            throw new IllegalArgumentException("Insert a number unlike zero to realize the operation.");
        }
        Operations operations = (Operations) this.applicationContext.getBean(String.valueOf(operation));
        double resultOperation = operations.execute(value1, value2);
        operationsHistory.add(new Operation(value1, value1, resultOperation, operation));
        return resultOperation;
    }

    public List<Operation> getOperationsHistory(){
        return operationsHistory;
    }

    public double getResultOfRealizedOperation(int index) throws IndexOutOfBoundsException {
        return getOperationsHistory().get(index).getResultValue();
    }
}