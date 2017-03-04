import java.util.ArrayList;

public class ShoppingCart {

	ArrayList<Pizza> pizzas = new ArrayList<>();

	public String addPizza(Pizza pizza) {
		if (pizza.getIngredientsCounter() == 0) {
			return "Pizza needs ingredients to be added to shopping cart";
		}
		else {
			pizzas.add(pizza);
			return "Pizza added succesfully";
		}
	}

	public Double getTotalPrice() {
		Double price = 0.0;

		for (Pizza pizza : pizzas) {
			price += pizza.getPrice();
		}
		return price;
	}

}
