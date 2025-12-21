public class TukeyBurger extends Burger {

   public TukeyBurger(boolean isDeluxe) {
      super("turkey burger", 16.50, isDeluxe);
   }

   public TukeyBurger(Toppings toppings, boolean isDeluxe) {
      super("turkey burger", 16.50, toppings, isDeluxe);
   }

   public TukeyBurger(Toppings toppings, Toppings secondToppings, boolean isDeluxe) {
      super("turkey burger", 16.50, toppings, secondToppings, isDeluxe);
   }

   public TukeyBurger(Toppings toppings, Toppings secondToppings, Toppings thirdToppings, boolean isDeluxe) {
      super("turkey burger", 16.50, toppings, secondToppings, thirdToppings, isDeluxe);
   }

   @Override
   public double getPrice() {
      return super.getPrice();
   }
}
