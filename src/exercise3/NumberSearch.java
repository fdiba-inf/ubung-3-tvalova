package exercise3;

public class NumberSearch {

  public static void main(String[] args) {
    
    int cnt = 0;
    for(int i = 100; i <= 1000; i++)
      if(i % 30 == 0) {
        System.out.print(i);
        cnt++;
        if(cnt % 10 == 0) System.out.println();
        else System.out.print(" ");
      }
  }
}