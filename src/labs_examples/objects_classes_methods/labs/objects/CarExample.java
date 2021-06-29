package labs_examples.objects_classes_methods.labs.objects;

/**
 * Created by ryandesmond - https://codingnomads.co
 * /
 * */

class Example {

    public static void main(String[] args){

        Engine myEngine = new Engine(400);

        Stereo myStereo = new Stereo("Panasonic");

        Car myCar = new Car(myEngine, myStereo, "XTerra", "Blue");

        System.out.println("I drive a " + myCar.color + " " + myCar.model + " with a "

                + myCar.stereo.brand + " stereo, and a " + myCar.engine.horsePower + " engine");

        // OR

        System.out.println(myCar.toString());

        //
        Engine myAirplaneEngine = new Engine(400);

        Stereo myAirplaneStereo = new Stereo("Sony");
        Airplane myAirplane = new Airplane(myAirplaneEngine, myAirplaneStereo,"Boeing", "Grey", 200, 120);

        System.out.println("The airplane has a " + myAirplane.engine.horsePower + "hp engine with a " + myAirplane.stereo.brand + " stereo.");
        System.out.println("The airplane is a " + myAirplane.color + " " + myAirplane.model + " with a max fuel capacity of " +myAirplane.fuelCapacity + "." );
        System.out.println("The current fuel capacity is " + myAirplane.currentFuelLevel + ".");
    }

}

class Engine {

    double horsePower;

    public Engine(double horsePower){

        this.horsePower = horsePower;

    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
}

class Stereo {

    String brand;

    public Stereo(String brand){

        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Stereo{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

class Car {

    Engine engine;

    Stereo stereo;

    String model;

    String color;

    public Car(Engine engine, Stereo stereo, String model, String color){

        this.engine = engine;

        this.stereo = stereo;

        this.model = model;

        this.color = color;

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine.toString() +
                ",\n stereo=" + stereo.toString() +
                ",\n model='" + model + '\'' +
                ",\n color='" + color + '\'' +
                '}';
    }
}

class Airplane {

    Engine engine;

    Stereo stereo;

    String model;

    String color;
    double fuelCapacity;
    double currentFuelLevel;



    public Airplane(Engine engine, Stereo stereo, String model, String color, double fuelCapacity, double currentFuelLevel) {

        this.engine = engine;
        this.stereo = stereo;
        this.model = model;
        this.color = color;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;



    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Stereo getStereo() {
        return stereo;
    }

    public void setStereo(Stereo stereo) {
        this.stereo = stereo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engine=" + engine +
                ", stereo=" + stereo +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

