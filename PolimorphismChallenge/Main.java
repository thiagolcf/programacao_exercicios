public class Main {
    
    public static void main(String[] args) {
     Car car = new Car("2022 Blue Ferrari 296 GTS");
     runeRace(car);
    
    GasPoweredCar ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
    runeRace(ferrari);
    }
    public static void runeRace(Car car) {
        car.startEngine();
        car.drive();
    }
    
}
