package acadamy.learnprogramming;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders){
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName(){
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

}

class Jeep extends Car {
    public Jeep(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Jeep -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Jeep -> accelerate()";
    }

    @Override
    public String brake() {
        return "Jeep -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Jeep jeep = new Jeep("Wrangler", 6);
        System.out.println(jeep.startEngine());
        System.out.println(jeep.accelerate());
        System.out.println(jeep.brake());
    }
}
