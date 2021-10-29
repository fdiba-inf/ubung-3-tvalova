package exercise3;
import java.util.Scanner;

public class NumberCounter {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double number = input.nextDouble();
    double positive = 0;
    double negative = 0;
    double sum = 0;

    while(number != 0){
      if(number >= 0){
        number = positive++;
      } else {
        number = negative++;
      }
      number = input.nextDouble();
      sum += number; 
    }
    double avrg = sum / (positive + negative);

    System.out.println("Positive number: " + positive);
    System.out.println("Negative number: " + negative);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + avrg);
  }
}