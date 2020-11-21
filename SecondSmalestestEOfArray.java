
package New.folder;

/**
 *
 * @author WIN
 */
public class SecondSmalestestEOfArray {
     public static void main(String[] args) {
        int [] a = {2,3,6,9,1,8,7,4};
        for(int i=0;i<a.length;i++){
            
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
        
            }
       }
        System.out.println(a[1]);
    }
    
    
}
