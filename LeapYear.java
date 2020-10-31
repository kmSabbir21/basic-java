
package homework;

public class LeapYear{
    public static void main(String[] args) {
    
       int year=3333 ;
        if(year%4==0){
            if(year%400==0){
                if(year%100==0){
                System.out.println("leap year");
                
                }
                else{
                System.out.println("No");
                }
            
            }
            else{
            System.out.println("not");
            }
            
        }
        else{
        System.out.println("Not a leap year");
            }
        
        }
      
    }
    

