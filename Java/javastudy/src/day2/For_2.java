package day2;

public class For_2 {
  public static void main(String[] args) {

    for (int i = 2; i <= 4; i = i + 1) {

      System.out.println( i + " 단 ");

      for (int j = 1; j <= 3 ; j = j + 1) {

        System.out.println( i + " * " + j + " = " + i * j);

      }

    }

  }
}
