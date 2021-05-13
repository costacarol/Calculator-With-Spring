package io.github.costacarol.annotation.command;

import org.springframework.stereotype.Component;

@Component
public interface Operations {

    double execute(double value1, double value2);
}
