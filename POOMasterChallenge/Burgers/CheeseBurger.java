public class CheeseBurger extends Burger {
    
    public CheeseBurger(boolean isDeluxe){
        super("cheeseburger", 7.50, isDeluxe);
    }

   public CheeseBurger(Toppings toppings, boolean isDeluxe) {
    super("cheeseburger", 7.50, toppings, isDeluxe);
   } 

   public CheeseBurger(Toppings toppings, Toppings secondToppings, boolean isDeluxe) {
    super("cheeseburger", 7.50, toppings, secondToppings , isDeluxe);

   }

   public CheeseBurger(Toppings toppings, Toppings secondToppings, Toppings thirdToppings, boolean isDeluxe) {
    super("cheeseburger", 7.50, toppings, secondToppings, thirdToppings, isDeluxe);
   }
}
