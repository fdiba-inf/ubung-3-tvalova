package exercise3;
import java.util.Scanner;

public class AngleCalculation {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  char unit;
  double pi = 3.14159265359;
  do {
  double number = input.nextDouble();
  unit = input.next().charAt(0);
  
  if(unit == 'd') {
  double r = number * pi / 180;
  System.out.println("Angle: " + r + "r");
  } else if(unit == 'r') {
    double d = number * 180 / pi;
    System.out.println("Angle: " + d + "d");
  } else {
    System.out.println("Incorrect unit");
  }  
  } while(unit == 'd' || unit == 'r');
  }
}