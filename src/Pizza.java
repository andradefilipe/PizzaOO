import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {

	private Integer ingredientsCounter = 0;
	private ArrayList<String> ingredientsOnThisPizza = new ArrayList<>();
	private static HashMap<String, Integer> ingredients = new HashMap<>();

	public void addIngredient(String ingredient) {
		ingredientsOnThisPizza.add(ingredient);
		if (ingredients.containsKey(ingredient)) {
			int count = ingredients.get(ingredient);
			ingredients.put(ingredient, ++count);

		} else {
			ingredients.put(ingredient, 1);
			incrementIngredientsCounter();
		}
	}

	public Double getPrice() {
		Double price = 0.0;
		if (getIngredientsCounter() < 2) {
			price = 15.0;
		} else if (getIngredientsCounter() >= 2 && getIngredientsCounter() <= 5) {
			price = 20.0;
		}
		else if (getIngredientsCounter() > 5) {
			price = 23.0;
		}
		return price;
	}

	private Integer incrementIngredientsCounter() {
		return ingredientsCounter++;
	}

	public Integer getIngredientsCounter() {
		return ingredientsCounter;
	}

	public void getIngredientsOnPizza() {
		System.out.println(ingredientsOnThisPizza.toString());
	}

	public static void listAllIngredients() {
		System.out.println(ingredients.toString());
	}

}
