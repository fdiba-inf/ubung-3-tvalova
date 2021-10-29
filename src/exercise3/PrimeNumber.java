package exercise3;
import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     boolean prime = true;
     int a = 2;
     int n = input.nextInt();
     
     while(n > 2 && a != n){
       if(n % a == 0){
       prime = false;
       break;
       }  
       a++;
     } 
     System.out.println("Prime number: " + prime);
  }
}