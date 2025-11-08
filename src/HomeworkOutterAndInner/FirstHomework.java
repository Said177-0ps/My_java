package HomeworkOutterAndInner;

public class FirstHomework {
    public static void main(String[] args) {
        Greeting Gret = new Greeting();

        Gret.showMessage();
    }
}

class Greeting{
    void showMessage(){
        Message ms = new Message();

        ms.Print();
    }

    class Message{
        void Print(){
            System.out.println("Привет из локального класса");
        }
    }
}
