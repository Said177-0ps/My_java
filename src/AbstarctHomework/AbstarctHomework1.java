package AbstarctHomework;

public class AbstarctHomework1 {
}

abstract class Robot{
    String name;
void sayHello(){
    System.out.println(name + "Robots");
}
abstract void doTask();
}


class Cleaners extends Robot{
    String name = "CleanerBot";
    void doTask(){
        System.out.println("Hi, My name is" + name  + ", my Task is to clean a rooms");
    }
}

class GuardBot extends Robot{
    String name = "GuardBot";
    void doTask(){
        System.out.println("Hi, My name is" + name +", my Task is to Guard a Home");
    }
}

class ChefBot extends Robot{
    String name = "ChefBot";
    void doTask(){
        System.out.println("Hi, My name is" + name + ", my Task is to Cook");
    }
}
