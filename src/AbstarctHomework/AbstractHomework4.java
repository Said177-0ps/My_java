package AbstarctHomework;

public class AbstractHomework4 {
   public static void main(String[] args) {
       RollerCoaster Roller = new RollerCoaster();
       FerrisWheel Ferris = new FerrisWheel();
       HauntedHouse house = new HauntedHouse();

       Roller.startRide();
       Roller.enjoy();
       System.out.println();

       Ferris.startRide();
       Ferris.enjoy();
       System.out.println();

       house.startRide();
       house.enjoy();
    }
}

abstract class ride{
    String name;

    void startRide(){
        System.out.println("wanna ride in" + name);
    }
    abstract void enjoy();
}

class RollerCoaster extends ride{
    String name = "RollerCoaster";
    void enjoy(){
        System.out.println("Wanna ride in" + name);
    }
}

class FerrisWheel  extends ride{
    String name = "FerrisWheel ";
    void enjoy(){
        System.out.println("Wanna ride in" + name);
    }
}

class HauntedHouse  extends ride{
    String name = "HauntedHouse ";
    void enjoy(){
        System.out.println("Wanna ride in" + name);
    }
}
