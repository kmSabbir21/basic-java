package diunotes;

import java.util.Scanner;
public class UserInputOutput {
    
  public static void main(String[] args) {
        
        int x,a;
        double y,b;
        Scanner w = new Scanner(System.in);
        
       x = w.nextInt();
       y =w.nextDouble();
       a = x+2;
       b = y-3;
       System.out.println("The value of a is:" +a+ "\n" +"The value of b is:"+b);
    }
    
}
