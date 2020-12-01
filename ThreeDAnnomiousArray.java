package New.folder;
public class ThreeDAnnomiousArray {
     static void sum(int [][][] no){
        int total=0;
        
        for(int iii[][]:no){
            
           for(int ii[]:iii){
               
             for(int i:ii){
                 
              total=total+i;
                }
            
            }
           
        }
         System.out.println(total);
    }
    public static void main(String[] args) {
        
        ThreeDAnnomiousArray.sum(new int [][][]{{{1,2,3},{3,4,5}},{{20}}});
        
    }
           
}

