package br.com.studies.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.studies.exception.UnsuportedMathOperationException;
import br.com.studies.math.SimpleMath;
import br.com.studies.request.converters.NumberConverter;

@RestController
public class PersonController {
	
	private SimpleMath math  = new SimpleMath();
	
	@RequestMapping(value = "/sun/{numberone}/{numbertwo}", method = RequestMethod.GET)
	public Double sun(@PathVariable("numberone") String numberone, @PathVariable("numbertwo") String numbertwo) throws Exception {
		if(!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) {
			throw new UnsuportedMathOperationException("Por favor defina um valor numérico!");
		}
		
		return math.sun(NumberConverter.convertToDouble(numberone) , NumberConverter.convertToDouble(numbertwo));

	}

	@RequestMapping(value = "/subtraction/{numberone}/{numbertwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberone") String numberone, @PathVariable("numbertwo") String numbertwo) throws Exception {
		if(!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) {
			throw new UnsuportedMathOperationException("Por favor defina um valor numérico!");
		}
		
		return math.subtraction(NumberConverter.convertToDouble(numberone) , NumberConverter.convertToDouble(numbertwo));
	}
	
	@RequestMapping(value = "/multiplication/{numberone}/{numbertwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberone") String numberone, @PathVariable("numbertwo") String numbertwo) throws Exception {
		if(!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) {
			throw new UnsuportedMathOperationException("Por favor defina um valor numérico!");
		}
		
		return math.multiplication(NumberConverter.convertToDouble(numberone) , NumberConverter.convertToDouble(numbertwo));
	}
	
	@RequestMapping(value = "/division/{numberone}/{numbertwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberone") String numberone, @PathVariable("numbertwo") String numbertwo) throws Exception {
		if(!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) {
			throw new UnsuportedMathOperationException("Por favor defina um valor numérico!");
		}

		return math.division(NumberConverter.convertToDouble(numberone) , NumberConverter.convertToDouble(numbertwo));
	}
	
	@RequestMapping(value = "/mean/{numberone}/{numbertwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberone") String numberone, @PathVariable("numbertwo") String numbertwo) throws Exception {
		if(!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) {
			throw new UnsuportedMathOperationException("Por favor defina um valor numérico!");
		}

		return math.mean(NumberConverter.convertToDouble(numberone) , NumberConverter.convertToDouble(numbertwo));
	}
	
	@RequestMapping(value = "/squareoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) throws Exception {
		if(!NumberConverter.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Por favor defina um valor numérico!");
		}
		
		return math.squareRoot(NumberConverter.convertToDouble(number));
	}
	

}
