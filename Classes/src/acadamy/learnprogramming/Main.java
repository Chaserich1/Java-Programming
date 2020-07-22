package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car ford = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
