package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.NegativeNumberException;

public class Recipe {
	private List<Ingredient> ingredients;
	
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) throws NegativeNumberException {

		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}
		
		if(searched!=null) {
			searched.addWeight(w);
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
			
		}		
	}
	
	public int countIngredients() {
		int count = 0;
		boolean stop = false;
		
		for(int i = 0;i<ingredients.size() && !stop;i++) {
			if(ingredients.get(i) != null) {
				count +=1;
			}
			else {
				stop = true;
			}
		}
		
		return count;
	}
	
	public Ingredient getIngredient(int index) {
		return ingredients.get(index);
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
	
	public String toString() {
		String out = "";
		boolean stop = false;
		for(int i = 0;i<ingredients.size() && !stop;i++) {
			if(ingredients.get(i) != null) {
				out = "//Ingrediente "+(i+1)+"//\n"+
						"Name: "+ingredients.get(i).getName()+"\n"+
						"Weight: "+ingredients.get(i).getWeight();
			}
			else {
				stop = true;
			}
		}
		return out;
	}
}