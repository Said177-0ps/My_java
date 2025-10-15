package ClassWork;

public class InClassParents {
    public static void main() {
        playSound PlaySounds = new playSound();

        PlaySounds.Guitar = "Rock";
        PlaySounds.Piano = "silent music";
        PlaySounds.Baraban = "k-pop";
        PlaySounds.Musics_Info();
    }

    static abstract class playSound{
        String Guitar;
        String Piano;
        String Baraban;


        void Musics_Info(){
            System.out.println(Guitar);
            System.out.println(Piano);
            System.out.println(Baraban);
        }

        abstract void Guitar_Info();

        abstract void Piano_Info();
    }

    class Info extends playSound{
        @Override
        void Guitar_Info(){
            System.out.println("This music is playing:" + Guitar);
        }

        @Override
        void Piano_Info(){
            System.out.println("This music is playing:" + Piano);
        }

        @Override
        void Baraban_Info(){
            System.out.println("This music is playing:" + Baraban);
        }


    }

}
