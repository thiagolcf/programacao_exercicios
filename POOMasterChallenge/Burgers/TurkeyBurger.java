public class VeggieBurger extends Burger {
    
    public VeggieBurger(){
        super("cheeseburger", 7.50);
    }

   public VeggieBurger(Toppings toppings) {
    super("cheeseburger", 7.50, toppings);
   } 

   public CheeseBurger(Toppings toppings, Toppings secondToppings) {
    super("cheeseburger", 7.50, toppings, secondToppings);

   }

   public CheeseBurger(Toppings toppings, Toppings secondToppings, Toppings thirdToppings) {
    super("cheeseburger", 7.50, toppings, secondToppings, thirdToppings)
   }
}

