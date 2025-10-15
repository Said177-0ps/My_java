package ParentHomew;

public  class ParentMain {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "Harry Dog";
        dog.age = 5;
        dog.breed = "Haski";

        dog.MakeASound();

        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Breed: " + dog.breed);

        Vehicle v = new Vehicle("Idk", 2020);
        Car c = new Car("Lamborghini", 2024, 2);
        Bike b = new Bike("Bmx", 2018, "Sport");


        v.drive();
        c.drive();
        b.drive();
        Vehicle[] vehicles = {v, c, b};
        for (Vehicle vehicle: vehicles) {
            vehicle.drive();
        }
    }
}
