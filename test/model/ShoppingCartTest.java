package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {

	Pizza pepperoni;
	Pizza bacon;
	Pizza noIngredients;
	ShoppingCart cart;

	@Before
	public void setup() {
		pepperoni = new Pizza();
		bacon = new Pizza();
		noIngredients = new Pizza();
		cart = new ShoppingCart();
		Pizza.resetAllIngredientsCounter();

		pepperoni.addIngredient("Pepperoni");
		pepperoni.addIngredient("Cheese");
		pepperoni.addIngredient("Ham");

		bacon.addIngredient("Bacon");
		bacon.addIngredient("Cheese");

	}

	@Test
	public void testTotalPriceOnePizzaTwoIngredients() {
		cart.addPizza(bacon);

		assertEquals(Double.valueOf(15.0), cart.getTotalPrice());
	}

	@Test
	public void testTwoPizzas() {
		cart.addPizza(bacon);
		cart.addPizza(pepperoni);

		assertEquals(Double.valueOf(35.0), cart.getTotalPrice());
	}

	@Test
	public void testEmptyPizza() {
		cart.addPizza(noIngredients);

		assertEquals(Double.valueOf(0.0), cart.getTotalPrice());
	}

}
