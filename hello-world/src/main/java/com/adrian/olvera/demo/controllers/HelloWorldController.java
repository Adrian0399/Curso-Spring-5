/**
 * 
 */
package com.adrian.olvera.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adolvera
 *
 */

@RestController 	//Define que la clase es un controlador
@RequestMapping("/Hello-world")		//Esta define el punto de inicio, o como se invoca el codigo
public class HelloWorldController {
	
	@GetMapping //Acceder al codigo con el metodo GetMapping
	public ResponseEntity<String> helloWorld(){
		return new ResponseEntity<>("HelloWorld",HttpStatus.OK);
	}
}
