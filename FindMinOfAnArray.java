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
public class FindMinOfAnArray {
    public static void main(String[] args) {
        int [] a ={3,2,4,7,8,-5,5};
        int min = a[0];
        
        for(int i=0;i<a.length;i++){
             if(min>a[i]){
              min=a[i];
             } 
        }
         System.out.println(min);
    }

}
