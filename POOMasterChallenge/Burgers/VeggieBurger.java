public class VeggieBurger extends Burger {
    
    public VeggieBurger(boolean isDeluxe){
        super("veggie burger", 7.50, isDeluxe);
    }

   public VeggieBurger(Toppings toppings, boolean isDeluxe) {
    super("veggie burger", 7.50, toppings, isDeluxe );
   } 

   public VeggieBurger(Toppings toppings, Toppings secondToppings, boolean isDeluxe) {
    super("veggie burger", 7.50, toppings, secondToppings, isDeluxe);

   }

   public VeggieBurger(Toppings toppings, Toppings secondToppings, Toppings thirdToppings, boolean isDeluxe) {
    super("veggie burger", 7.50, toppings, secondToppings, thirdToppings, isDeluxe);
   }
}


