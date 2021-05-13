package io.github.costacarol.annotation.command;

import org.springframework.stereotype.Component;

@Component
public class Pow implements Operations {

    @Override
    public double execute(double value1, double value2) {
        return Math.round(Math.pow(value1, value2)*100)/100d;
    }
}
