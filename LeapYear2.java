
package homework;

public class LeapYear2 {
    public static void main(String[] args){
        int year=3030;
                
        if((year%4==0)||(year%400==0 && year%100!=0)){
        
        System.out.println("leap year");
        }
        else{
        System.out.println("no its not");
        }
       
    }
}
