package model;

import exceptions.NegativeNumberException;

public class Ingredient {
	
	//Attributes
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) throws NegativeNumberException {
		
		if(w <0) {
			throw new NegativeNumberException("");
		}
		
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException {
		try {
			if(additionalW <0) {
				throw new NegativeNumberException("");
			}else {
				weight = weight + additionalW;
				System.out.println("El peso del ingrediente se ha actualizado:"+
				weight);
			}
			
		}
		catch(NegativeNumberException e) {
			System.out.println("El peso del ingrediente queda en: "+ weight
					+", no se puede agregar valores negativos.");
		}		
	}
	
	public void removeWeight(double weightLess) throws NegativeNumberException  {
		try {
			if(weightLess < 0) {
				throw new NegativeNumberException("");
				
			}else {
				weight = weight - weightLess;
				System.out.println("El peso del ingrediente se ha actualizado:"+
				weight);
			}
			
		}
		catch(NegativeNumberException e) {
			System.out.println("El peso del ingrediente queda en: "+ weight
					+", no se puede utilizar valores negativos.");
		}		
	}
	
}
