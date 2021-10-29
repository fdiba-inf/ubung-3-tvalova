package exercise3;
import java.util.Scanner;

public class Triangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    do {
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      if (a <= 0 || b <= 0 || c <= 0) {
        System.out.println("Values are not correct!");
        break;
      } 
      if (a + b > c && b + c > a && a + c > b) {
        double s = (a + b + c) / 2.0;
        double f = s * (s - a) * (s - b) * (s - c);
        double fl = Math.sqrt(f);
        String triangle;
        System.out.println("Area: " + fl);
        if (a == b && b == c) {
          triangle = "equilateral";
        } else if (a != b && a != c && b != c) {
          triangle = "scalene";
        } else {
          triangle = "isosceles";
        }
        System.out.println("Triangle: " + triangle);
      } else {
        System.out.println("Values are not correct!");
      }
    } while (true);
  

  }
}