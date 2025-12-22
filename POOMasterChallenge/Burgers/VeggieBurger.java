public class VeggieBurger extends Burger {
    
    private static double price = 5.50;
    private static String name = "veggie burger";
 

    public VeggieBurger(boolean isDeluxe){
        super(name , price, isDeluxe);
        
    }

   public VeggieBurger(Toppings toppings, boolean isDeluxe) {
    super(name, price, toppings, isDeluxe);
   } 

   public VeggieBurger(Toppings toppings, Toppings secondToppings, boolean isDeluxe) {
    super(name, price, toppings, secondToppings , isDeluxe);

   }

   public VeggieBurger(Toppings toppings, Toppings secondToppings, Toppings thirdToppings, boolean isDeluxe) {
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


