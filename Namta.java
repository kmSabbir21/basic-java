package com.extra;
import java.util.Scanner;

public class Namta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int t = scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(t+"*"+i+"="+t*i);
        }
    }
    
}
