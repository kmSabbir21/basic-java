package New.folder;

public class TwoDAnnonimusArray {
    
    static void sum(int [][] no){
        int total=0;
        for(int ii[]:no){
          for(int i:ii){
            
            total=total+i;
            }
        }
    }
    public static void main(String[] args) {
        TwoDAnnonimusArray.sum(new int[][]{{10},{20}});
    }
    
}

//int[][][] test = {
//            {
//              {1, -2, 3}, 
//              {2, 3, 4}
//            }, 
//            { 
//              {-4, -5, 6, 9}, 
//              {1}, 
//              {2, 3}
//            } 
//        };
//        
//        int[][][] test2 = {///(new int [][][]{{{1,2,3},{3,4,5}},{{20}}});
//            {
//              {1, -2, 3}, 
//              {2, 3, 4}
//            }, 
//            { 
//              {-4, -5, 6, 9}, 
//              {1}, 
//              {2, 3}
//            } 
//        };
//        
//        sum(test);
