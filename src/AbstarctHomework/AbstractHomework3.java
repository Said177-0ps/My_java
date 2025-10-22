package AbstarctHomework;

public class AbstractHomework3 {
   public static void main(String[] args) {
       Elf elf = new Elf();
       Wizard wizard = new Wizard();
       Dragon dragon = new Dragon();

       elf.doMagic();
       wizard.doMagic();
       dragon.doMagic();
       System.out.println();
    }
}

class creature{
    void doMagic(){
        System.out.println("Я делаю магию");
    }
}

class Elf extends creature {
    @Override
   void doMagic(){
        System.out.println("Я Ельф.у меня Обояние, чуство и видимость Улучшаеться в 10 раз");
    }
}

class Wizard extends creature {
    @Override
    void doMagic(){
        System.out.println("Я Маг.Я могу управлять любой магией");
    }
}

class Dragon extends creature {
    @Override
    void doMagic(){
        System.out.println("Я Дракон.Я могу дышать огнем и могу летать");
    }
}
