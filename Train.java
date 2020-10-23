
package diunotes;

import java.util.Scanner;
//Class name:Train

public class Train {
     int NumberOfWagon=10; 
    String Dhaka="Dhaka";
    String Chittagong="Chittagong";
    String CoxsBazar="Coxsbazar";
   
    //Conostructor 1
    Train(){
        
    }
    //2nd conostructor
    Train(String Location){
        this.Dhaka = Location;
        this.Chittagong = Location;
        this.CoxsBazar = Location;
    }
    
    //3rd constructor
    Train(int Wagon){
    this.NumberOfWagon = Wagon;
    }
    //1st methood
    static int numberOfPassenger(int passenger){
       Train train = new Train(); 
       int totalPassenger = train.NumberOfWagon*passenger;
    return totalPassenger;
    
    }
    
    //2nd methood
    static String Destination(String desige){
        Train train = new Train();
        if(train.Dhaka.equals(desige)){
            return "per head 300tk";
        }
        else if(train.Chittagong.equals(desige)){
        return "per head 400tk";
        }
        else if(train.CoxsBazar.equals(desige)){
        return "per head 500tk";
        }
        else{
        return "Location does not match";
        }
    }
    
    //Main methood
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your Destinaton:");
         String destination = Destination(scanner.nextLine());       
        
         System.out.print("Passengers: ");
         int passenger = numberOfPassenger(scanner.nextInt());
         
         System.out.println("Total number of passengers:"+passenger);
         System.out.println(destination);
       
    }
    
}
