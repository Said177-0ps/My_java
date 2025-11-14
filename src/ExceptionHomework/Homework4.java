package ExceptionHomework;

public class Homework4 {
    public static void main(String[] args) {
      try {
          myAge(12);

      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
    }
}

public class Main{
    public static void myAge(int age) throws Execption{
     if (age < 18) {
         throw new Exception("Вас нет 18");
     } else {
         System.out.println("Добро Пожаловать");
     }
    }
}

// не понел ?
