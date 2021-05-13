package io.github.costacarol.annotation.app;

import io.github.costacarol.annotation.command.*;
import io.github.costacarol.annotation.service.CalculatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "io.github.costacarol.annotation")
public class AppConfig {

    @Bean
    public CalculatorService calculatorService(){
        return new CalculatorService();
    }

    @Bean (name = "SUB")
    @Scope("prototype")
    public Operations sub(){
        return new Sub();
    }

    @Bean (name = "SUM")
    @Scope("prototype")
    public Operations sum(){
        return new Sum();
    }

    @Bean (name = "DIVISION")
    @Scope("prototype")
    public Operations division(){
        return new Division();
    }

    @Bean (name = "MULTIPLY")
    @Scope("prototype")
    public Operations multiply(){
        return new Multiply();
    }

    @Bean (name = "POW")
    @Scope("prototype")
    public Operations pow(){
        return new Pow();
    }
}
