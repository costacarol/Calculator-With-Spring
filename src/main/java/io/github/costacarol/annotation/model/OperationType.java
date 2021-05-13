package io.github.costacarol.annotation.model;

public enum OperationType {
    DIVISION("/"),
    MULTIPLY("*"),
    POW("^"),
    SUB("-"),
    SUM("+");

    private final String operationSymbol;

    OperationType(String operationSymbol) {
        this.operationSymbol = operationSymbol;
    }

    public String getOperationSymbol() {
        return operationSymbol;
    }
}
