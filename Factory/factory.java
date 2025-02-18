// Product Interface
interface Car {
    void drive();
}

// Concrete Products
class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Sedan!");
    }
}

class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an SUV!");
    }
}

class Truck implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Truck!");
    }
}

// Factory (Creator) Interface
interface CarFactory {
    public abstract Car createCar();
}

// Concrete Factories
class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();  // Returns a concrete product (Sedan)
    }
}

class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV();  // Returns a concrete product (SUV)
    }
}

class TruckFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Truck();  // Returns a concrete product (Truck)
    }
}

// Client Code
public class factory {
    public static void main(String[] args) {
        CarFactory factory;

        // Create a Sedan
        factory = new SedanFactory();
        Car car1 = factory.createCar();
        car1.drive();

        // Create an SUV
        factory = new SUVFactory();
        Car car2 = factory.createCar();
        car2.drive();

        // Create a Truck
        factory = new TruckFactory();
        Car car3 = factory.createCar();
        car3.drive();
    }
}
