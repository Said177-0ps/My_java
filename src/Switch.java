public class Switch {
   public static void main(String[] args) {
        int month = 0;

        switch (month) {
            case 0:
                System.out.println("December");
                break;
            case 1:
                System.out.println("Janaury");
                break;
            case 2:
                System.out.println("Fevral");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("Jule");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            default:
                System.out.println("There No like that Months");
        }

        int grade = 4;

        switch (grade) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("No grades");
        }
    }
}
