package AbstarctHomework;

public class AbstractHomeowrk2 {
   public static void main(String[] args) {
       CargoShip cargo = new CargoShip();
       FighterShip fighter = new FighterShip();
       ExplorerShip explorer = new ExplorerShip();

       cargo.fly();
       System.out.println();

       fighter.fly();
       System.out.println();

       explorer.fly();
    }
}


class SpaceShip {
    String name;
    int speed;

     void fly() {
         System.out.println("Hi This spaceShip is" + name + "and his speed is" + speed + "km/h");
     }
}

class CargoShip extends SpaceShip{
    String name = "CargoShip";
    int speed = 1200;
    void fly() {
        System.out.println("I transport Objects");
    }
}

class FighterShip  extends SpaceShip{
    String name = "FighterShip";
    int speed = 1600;
    void fly() {
        System.out.println("I fight to another SpaceShips");
    }
}

class ExplorerShip  extends SpaceShip{
    String name = "ExploreShip";
    int speed = 900;
    void fly() {
        System.out.println("I Explore new planets");
    }
}