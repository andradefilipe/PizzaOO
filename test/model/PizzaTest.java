package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PizzaTest {
	Pizza pepperoni;

	@Before
	public void setup() {
		pepperoni = new Pizza();
		Pizza.resetAllIngredientsCounter();
	}

	@Test
	public void testIngredientsCounter() {
		assertEquals(Pizza.ingredients.size(), 0);
	}

	@Test
	public void testPizzaIngredientsCounter() {
		pepperoni.addIngredient("Pepperoni");
		pepperoni.addIngredient("Ham");

		assertEquals(Pizza.ingredients.size(), 2);
	}

	@Test
	public void testPizza2IngredientsPrice() {
		pepperoni.addIngredient("Pepperoni");
		pepperoni.addIngredient("Ham");

		assertEquals(Double.valueOf(15.0), pepperoni.getPrice());
	}

	@Test
	public void testPizza3IngredientsPrice() {
		pepperoni.addIngredient("Pepperoni");
		pepperoni.addIngredient("Cheese");
		pepperoni.addIngredient("Ham");

		assertEquals(Double.valueOf(20.0), pepperoni.getPrice());
	}

	@Test
	public void testPizza6IngredientsPrice() {
		pepperoni.addIngredient("Pepperoni");
		pepperoni.addIngredient("Cheese");
		pepperoni.addIngredient("Ham");
		pepperoni.addIngredient("Bacon");
		pepperoni.addIngredient("Chocolate");
		pepperoni.addIngredient("Salmon");

		assertEquals(Double.valueOf(23.0), pepperoni.getPrice());
	}

	@Test
	public void testPizza6DuplicateIngredients() {
		pepperoni.addIngredient("Pepperoni");
		pepperoni.addIngredient("Cheese");
		pepperoni.addIngredient("Cheese");

		assertEquals(Pizza.ingredients.get("Cheese"), Integer.valueOf(2));
	}

	@Test
	public void testIngredientsCou23nter() {

		pepperoni.addIngredient("Pepperoni");
		pepperoni.addIngredient("Cheese");

		Pizza.resetAllIngredientsCounter();

		assertEquals(Pizza.ingredients.size(), 0);
	}

}
