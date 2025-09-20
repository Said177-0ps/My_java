public class main {
    public static void main(String[] args) {
        String name = "said";
        int age = 12;
        String city = "Baku";
        String favoritebook = "Harry Potter";

        if (age < 18) {
            System.out.println("Вы совершеналетние");
        } else if (age >= 18) {
            System.out.println("Вы совершеналетние");
        } else if (age <= 50) {
            System.out.println("ВЫ находитесь в Возрасте мудрости");
        }

        if (age < 18 && city == "Moskva") {
            System.out.println("Вы несовершеналетний но из Москвы");
        } else if (age > 30 && city != "Sankt-peterbuyg") {
            System.out.println("Вы старше 30 лет и  не из Санк-петебурга");
        }

        if (favoritebook == "war and peace") {
            System.out.println("You like classic books");
        } else if (favoritebook == "Harry Potter") {
            System.out.println("You like magic books");
        }
    }
}
