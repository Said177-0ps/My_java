package ParentHomew;

class Animal{
    String name;
    int age;
    void MakeASound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;
    void MakeASound(){
        System.out.println("Dog barks");
    }
}


class Vehicle{
    String brand;
    int year;

    Vehicle(String b, int y){
        brand = b;
        year = y;
    }

    void drive() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle{
    int doors;

    Car(String b, int y, int d){
        super(b,y);
        doors = d;
    }

    void drive() {
        System.out.println("Car is Driving");
    }
}

class Bike extends Vehicle{
    String type;

    Bike(String b, int y, String t){
        super(b, y);
        type = t;
    }

    void drive() {
        System.out.println("Bike is riding");
    }
}

