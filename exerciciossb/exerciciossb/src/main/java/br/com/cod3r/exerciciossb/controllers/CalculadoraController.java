package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	// /calculadora/somar/10/20
	
	@GetMapping("/somar/{a}/{b}")
	public Integer Somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
	
	// /calculadora/subtrair?a=100&b=39
	@GetMapping("/subtrair")
	public Integer Subtrair(
			@RequestParam(name = "a", defaultValue = "0") int a, 
			@RequestParam(name = "b", defaultValue = "0") int b) {
		return a - b;
	}
	
}

