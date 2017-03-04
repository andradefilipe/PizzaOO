
public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Pizza pepperoni = new Pizza();
		Pizza bacon = new Pizza();
		Pizza chocolate = new Pizza();
		Pizza noIngredients = new Pizza();

		pepperoni.addIngredient("Pepperoni");
		pepperoni.addIngredient("Cheese");
		pepperoni.addIngredient("Ham");

		bacon.addIngredient("Bacon");
		bacon.addIngredient("Cheese");

		chocolate.addIngredient("Chocolate");

		System.out.println(cart.addPizza(pepperoni));
		System.out.println(cart.addPizza(bacon));
		System.out.println(cart.addPizza(chocolate));
		System.out.println(cart.addPizza(noIngredients));

		System.out.println("The total price is $" + cart.getTotalPrice());

		Pizza.listAllIngredients();

		pepperoni.getIngredientsOnPizza();
		System.out.println(pepperoni.getPrice());

		bacon.getIngredientsOnPizza();
		System.out.println(bacon.getPrice());

		chocolate.getIngredientsOnPizza();
		System.out.println(chocolate.getPrice());

	}

}
