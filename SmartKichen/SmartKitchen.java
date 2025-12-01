public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWaser;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWaser = dishWasher;
        this.iceBox = iceBox;
    }

    public SmartKitchen(){

    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWaser.setHasWorkToDo(true);
    }

    public void doKitchenWork() {
        addWater();
        pourMilk();
        loadDishwasher();
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo() {
        if (hasWorkToDo) {
            System.out.println("The refrigeretor is working...");
            hasWorkToDo = false;
        }
        return hasWorkToDo;
    }

    public boolean setHasWorkToDo(boolean has) {
        return hasWorkToDo = has;
    }

    public void orderFood() {
    }

}

class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo() {
        if (hasWorkToDo) {
            System.out.println("The dish washer is working...");
            hasWorkToDo = false;
        }
        return hasWorkToDo;
    }

    public boolean setHasWorkToDo(boolean has) {
        return hasWorkToDo = has;
    }

    public void doDishes() {
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo() {
        if (hasWorkToDo) {
            System.out.println("The coffee maker is working...");
            hasWorkToDo = false;
        }
        return hasWorkToDo;

    }

    public boolean setHasWorkToDo(boolean has) {
        return hasWorkToDo = has;
    }

    public void brewCoffee() {
    }
}