package ClassWork;

public class InClassParents {
    public static void main(String[] args) {
        playSound PlaySounds = new playSound();

        PlaySounds.Guitar = "Rock";
        PlaySound.Piano = "silent music";
        PlaySound.Baraban = "k-pop";
        PlaySound.musicsInfo();
    }

    static class PlaySound{
        String Guitar;
        String Piano;
        String Baraban;


        void musicsInfo(){
            System.out.println(Guitar);
            System.out.println(Piano);
            System.out.println(Baraban);
        }

    }

    class Info extends playSound{
        @Override
        void musicsInfo(){
            System.out.println("This music is playing:" + Guitar);
        }

        @Override
        void musicsInfo(){
            System.out.println("This music is playing:" + Piano);
        }

        @Override
        void musicsInfo(){

            System.out.println("This music is playing:" + Baraban);
        }


    }

}
