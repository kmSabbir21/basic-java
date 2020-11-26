package New.folder;

public class SecondSmallestByIfElse {
    public static void main(String[] args) {
        int [] a ={2,5,6,3,7,1,8,13};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirddLargest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            
            if(a[i]>largest){
            thirddLargest=secondLargest;
            secondLargest=largest;
            largest = a[i];
            }
            
            else if(a[i]>secondLargest && a[i] != largest){
            //secondLargest=largest;
            thirddLargest=secondLargest;
            secondLargest=a[i];
            }
            
            else if(a[i]>thirddLargest && a[i] != secondLargest){
            thirddLargest=a[i];
            }
        }
        System.out.println("Third largest number is: "+thirddLargest+" "+secondLargest+" "+largest);
    }
    
}
