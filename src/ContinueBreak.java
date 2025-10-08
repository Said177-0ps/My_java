public class ContinueBreak {
  public static void main(String[] args) {

      for (int i = 0; i < 12; i++) {
          System.out.println(i + " ");
          if (i % 3 == 0) continue; {
              System.out.println("");
          }

          // с Break

          int number = 4;

          switch (number) {
              case 1:
                  System.out.println("There like number");
                  break;
              case 2:
                  System.out.println("There like number");
                  break;
              case 3:
                  System.out.println("There like number");
                  break;
              case 4:
                  System.out.println("There like number");
                  break;
              default:
                  System.out.println("No like that numbers");
          }
      }

    }
}
