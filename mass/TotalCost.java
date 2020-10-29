package mass;

public class TotalCost {
    static double totalTaka = 9000.0;
   static double ac;
   
 public static void main(String [] args){
   TotalCost t = new TotalCost(); 
     System.out.println("Total amount For per moenth:"+totalTaka);
     System.out.println("     ");
     
 PersonOne p1 = new PersonOne();
     System.out.println("Name :"+p1.name()+" || "+" Take mill Per month:"+p1.mill);
     int p1mill = p1.mill;
     System.out.println("     ");
     
     PersonTwo p2 = new PersonTwo();
     System.out.println("Name:"+p2.name()+" || "+" Take mill per moenths "+p2.mill);
     int p2mill = p2.mill;
     System.out.println("     ");
     
     PersonThree p3 = new PersonThree();
     System.out.println("Name:"+p3.name()+" || "+" Take mill per moenths "+p3.mill);
     int p3mill = p3.mill;
     System.out.println("     ");
     
     PersonFour p4 = new PersonFour();
     System.out.println("Name:"+p4.name()+" || "+" Take mill per moenths "+p4.mill);
     int p4mill = p4.mill;
     
     double totallMill = p1mill+p2mill+p3mill+p4mill;
     System.out.println("     ");
     System.out.println("In totall mill:"+totallMill);
     System.out.println("     ");
     
     double ac = totalTaka/totallMill;
     System.out.println("Per mill charge:"+ac);
     System.out.println("     ");
     
     System.out.println("Saju's cost for per moenths:"+ac*p1.mill);
     System.out.println("     ");
     
     System.out.println("Ashik's cost for per moenths:"+ac*p2.mill);
     System.out.println("     ");
     
     System.out.println("Sumon's cost for per moenths:"+ac*p3.mill);
     System.out.println("     ");
     
     System.out.println("Atif's cost for per moenths:"+ac*p4.mill);
 }
    
}
