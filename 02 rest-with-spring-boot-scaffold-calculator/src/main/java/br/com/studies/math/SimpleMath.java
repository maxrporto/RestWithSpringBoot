package br.com.studies.math;

public class SimpleMath {

	public Double sun(Double numberone, Double numbertwo){
		return numberone + numbertwo;
	}

	public Double subtraction(Double numberone, Double numbertwo){
		return numberone - numbertwo;
	}
	
	public Double multiplication(Double numberone, Double numbertwo) {				
		return numberone * numbertwo;
	}
	
	public Double division(Double numberone, Double numbertwo) {
		return numberone / numbertwo;
	}
	
	public Double mean(Double numberone, Double numbertwo) {
		return (numberone + numbertwo) / 2 ;
	}
	
	public Double squareRoot(Double number) {		
		return Math.sqrt(number) ;
	}

}
