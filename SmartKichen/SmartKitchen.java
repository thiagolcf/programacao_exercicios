public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWaser;
    private Refrigerator iceBox;

    public SmartKitchen (CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWaser = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater(){
        brewMaster
    }
    public void pourMilk(){

    }
    public void loadDishwasher(){
    }
    public void setKichenState(){}

    public void doKitchenWork(){}
}

class Refrigerator {
    private boolean hasWorkToDo;
    
    public Refrigerator (boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo(){
        if(hasWorkToDo = true){
            System.out.println("The refrigeretor is working...");
        }
        return hasWorkToDo;
    }



    public void orderFood(){}


}

class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo(){
        if(hasWorkToDo = true){
            System.out.println("The dish washer is working...");
        }
        return hasWorkToDo;
    }
    public void doDishes(){}
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo(){
        if(hasWorkToDo = true){
            System.out.println("The coffee maker is working...");
        }
        return hasWorkToDo;
    }
    public void brewCoffee(){}
}