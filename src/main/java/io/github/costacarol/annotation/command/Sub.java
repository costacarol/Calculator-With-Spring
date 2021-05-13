package io.github.costacarol.annotation.command;

import org.springframework.stereotype.Component;

@Component
public class Sub implements Operations {

    @Override
    public double execute(double value1, double value2) {
         return value1 - value2;
    }
}
