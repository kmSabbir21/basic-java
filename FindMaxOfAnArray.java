/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New.folder;

/**
 *
 * @author WIN
 */
public class FindMaxOfAnArray {
    public static void main(String[] args) {
        int [] a ={3,2,4,7,8,5};
        int max = a[0];
        
        for(int i=0;i<a.length;i++){
             if(max<a[i]){
              max=a[i];
             } 
        }
         System.out.println(max);
    }
    
}
