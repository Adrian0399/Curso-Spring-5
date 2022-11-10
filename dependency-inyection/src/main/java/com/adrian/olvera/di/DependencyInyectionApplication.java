package com.adrian.olvera.di;

import java.beans.Expression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.adrian.olvera.di.atributo.Coche;
import com.adrian.olvera.di.atributo.Motor;
import com.adrian.olvera.di.autowire.AreaCalculatorService;
import com.adrian.olvera.di.profiles.EnvironmentService;
import com.adrian.olvera.di.qualifiers.Animal;
import com.adrian.olvera.di.qualifiers.Nido;
import com.adrian.olvera.di.qualifiers.Perro;
import com.adrian.olvera.di.scopes.EjemploScopeService;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	@Bean
	public String getApplicationName() {
		return "¡Devs4j rules!";
	}
	
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		org.springframework.expression.Expression expression = parser.parseExpression("10 + 20");
		log.info("Result {} ", expression.getValue());
	}

}
