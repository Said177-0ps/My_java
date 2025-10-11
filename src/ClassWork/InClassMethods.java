package ClassWork;

public class InClassMethods {
    String Car;
    int maxspeed;
    String modelname;
    double price;

    void AboutCar(){
        if (Car == "Bmw 5" && modelname == "Bmw 5") {
            System.out.println("My Birhtday:" + "Bmw 5");
        } else {
            System.out.println("false, thats's not the model");
        }
    }
    void Int(){
        if (maxspeed == 250) {
            System.out.println("Max Speed:" + "250km/hour");
        } else {
            System.out.println("false, thats's not Max Speed");
        }


        for (int i = 50000; i > 50000; i++) {
            if (price == 50000 )  { //каждый раз когда повторяеться условие + 30000  но я незнаю как?
                System.out.println(price + 30000);
            } else {
                System.out.println("Its mistake do it again");
            }
        }
    }
}
