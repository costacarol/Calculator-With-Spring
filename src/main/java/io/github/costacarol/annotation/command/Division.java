package io.github.costacarol.annotation.command;

public class Division implements Operations {

    @Override
    public double execute(double value1, double value2) {
        return Math.round((value1 / value2)*100)/100d;
    }

}
