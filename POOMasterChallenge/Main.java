import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

		
		Toppings bacon = new Bacon();
		Toppings friedEgg = new FriedEgg();

		

	boolean isDeluxe = false;	
	

		String menuWelcome = """

				Welcome to the Nicest Meal!
				Make you meal with a burger, drink and side item
				or choose the default meal.

				1) Compose your meal
				2) Compose a deluxe meal
				3) Choose the default meal""";
	}

	void show(boolean isDeluxe, String input) {

		String menuChooseBurger = """

				Choose a burger type:

				1) Cheeseburger
				2) Turkey Burger
				3) Veggie Burger

				      """;

		String menuChooseToppings = """
				How many toppings do you want:

				0
				1
				2
				3

						""";
		String menuChooseDrink = """

				Choose a drink:

				1) Coke
				2) Soda

				      """;

		String menuChooseSideItem = """

				Choose a side Item:

				1) French Fries
				2) Apple Pie

				      """;

		switch (input) {
			case "1":
						
				break;
		
			case "2":

				break;
		
			default:
				break;
		}
	}



}