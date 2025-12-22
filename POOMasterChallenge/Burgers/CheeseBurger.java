public class CheeseBurger extends Burger {
    
    private static double price = 7.50;
    private static String name = "cheeseburger";
    

    public CheeseBurger(boolean isDeluxe){
        super(name , price, isDeluxe);
        
    }

   public CheeseBurger(Toppings toppings, boolean isDeluxe) {
    super(name, price, toppings, isDeluxe);
   } 

   public CheeseBurger(Toppings toppings, Toppings secondToppings, boolean isDeluxe) {
    super(name, price, toppings, secondToppings , isDeluxe);

   }

   public CheeseBurger(Toppings toppings, Toppings secondToppings, Toppings thirdToppings, boolean isDeluxe) {
    super(name, price, toppings, secondToppings, thirdToppings, isDeluxe);
   }

   @Override
   public double getPrice() {
    return super.getPrice();
   }

   public static String getName() {
    return name;
   }
   
}
