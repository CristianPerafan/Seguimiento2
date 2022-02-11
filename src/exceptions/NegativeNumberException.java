package exceptions;

import java.util.ArrayList;

import model.Ingredient;

public class NegativeNumberException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public NegativeNumberException(String msj) {
		super(msj);
	}
	
	public String addIngredient() {
		String out = "";
		
		return out;
	}
	
	public String removeIngredient(String n) {
		String out = "";
		
		return out;
	}
	
	public ArrayList<Ingredient> getIngredient(){
		return null;
	}

}
