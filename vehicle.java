class vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency() {
        return 0; 
    }

    public double calculateDistanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }

    public double getMaxSpeed() {
        return 0; 
    }

    
    public String toString() {
        return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", fuelType=" + fuelType + "]";
    }
}


class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    
    public double calculateFuelEfficiency() {
        return 15; 
    }

    
    public double getMaxSpeed() {
        return 120; 
    }
}


class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 30; 
    }

    @Override
    public double getMaxSpeed() {
        return 150;
    }
}


class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 50; 
    }

    @Override
    public double getMaxSpeed() {
        return 180;
    }
}


public class vehicle {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2020, "Diesel");
        Car car = new Car("Toyota", "Camry", 2021, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2019, "Gasoline");

        double truckFuelConsumed = 10;
        double carFuelConsumed = 5;
        double motorcycleFuelConsumed = 2; 
        System.out.println(truck);
        System.out.println("Truck Distance Traveled: " + truck.calculateDistanceTraveled(truckFuelConsumed) + " miles");
        System.out.println("Truck Maximum Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println(car);
        System.out.println("Car Distance Traveled: " + car.calculateDistanceTraveled(carFuelConsumed) + " miles");
        System.out.println("Car Maximum Speed: " + car.getMaxSpeed() + " mph\n");

        System.out.println(motorcycle);
        System.out.println("Motorcycle Distance Traveled: " + motorcycle.calculateDistanceTraveled(motorcycleFuelConsumed) + " miles");
        System.out.println("Motorcycle Maximum Speed: " + motorcycle.getMaxSpeed() + " mph");
    }
}







kinkusgdusgdsudgusd
ddjihd