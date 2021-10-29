package exercise3;
import java.util.Scanner;

public class AngleCalculation {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  char unit;
  do {
  int number = input.nextInt();
  unit = input.next().charAt(0);
  
  if(unit == 'd') {
  double r = number * 3.14 / 180;
  System.out.println("Angle: " + r + "r");
  } else if(unit == 'r') {
    double d = number * 180 / 3.14;
    System.out.println("Angle: " + d + "d");
  } else {
    System.out.println("Incorrect unit");
  }  
  } while(unit == 'd' || unit == 'r');
  }
}