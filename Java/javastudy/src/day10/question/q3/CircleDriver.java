package day10.question.q3;

import day9.access.pack2.C;

public class CircleDriver {
  public static void main(String[] args) {
    // (1) Circle 객체를 만들어 cir가 가리키게 한다.
    Circle cir = new Circle();
    // (2) cir의 반지름을 5.0으로 변경한다.
    cir.setRadius(5.0);
    // (3) cir의 면적을 구하여 area에 저장한다.
    double area = cir.computeArea();
    // (4) cir의 둘레를 구하여 perm에 저장한다.
    double perm = cir.computePerimeter();
    // (5) area와 perm을 출력한다.
    System.out.printf("area = %.1f / perm = %.1f", area, perm);
  }
}
