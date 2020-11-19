package New.folder;

public class AnnonimousArray {
    
    static void sum( int[] no){
    int total=0;
    for(int i:no){
    total=total+i;
    }
        System.out.println(total);
    }
    
    public static void main(String[] args) {
        AnnonimousArray.sum(new int[]{10,20,30,40,50});
    }
    
}
