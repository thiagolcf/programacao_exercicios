public class TurkeyBurger extends Burger {
    
    private static double price = 11.50;
    private static String name = "turkey burger";
 

    public TurkeyBurger(boolean isDeluxe){
        super(name , price, isDeluxe);
        
    }

   public TurkeyBurger(Toppings toppings, boolean isDeluxe) {
    super(name, price, toppings, isDeluxe);
   } 

   public TurkeyBurger(Toppings toppings, Toppings secondToppings, boolean isDeluxe) {
    super(name, price, toppings, secondToppings , isDeluxe);

   }

   public TurkeyBurger(Toppings toppings, Toppings secondToppings, Toppings thirdToppings, boolean isDeluxe) {
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

