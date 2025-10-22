package AbstarctHomework;

public class AbstractHomework5 {
   public static void main(String[] args) {
       Warrior Warri = new Warrior();
       Archer Arch = new Archer();
       Mage Mage = new Mage();

       Warri.Attack();
       Arch.Attack();
       Mage.Attack();
    }
}


class Hero{
    void Attack(){
        System.out.println("Привет Я атакую");
    }
}

class Warrior extends Hero{
    void Attack(){
        System.out.println("Привет Я атакую мечом. ближний бой");
    }
}

class Archer  extends Hero{
    void Attack(){
        System.out.println("Привет Я атакую стреляя из лука. Дальний бой");
    }
}

class Mage extends Hero{
    void Attack(){
        System.out.println("Привет Я Атакую использывае Заклинание. Средний бой");
    }
}
