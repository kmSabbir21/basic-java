/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softapple;

/**
 *
 * @author WIN
 */
public class ArmstongNumber {
    public static void main(String[] args) {
        int num = 153;
        int t1 =num;
        int len =0;
        while(t1 != 0){
            
            t1=t1/10;
            len = len+1;
        }
        
        int t2 = num;
        int rem,arm=0;
        
            while(t2 != 0){
            rem =t2%10;
            int mul = 1;
          
                for(int i =1;i<=len;i++){
                        mul =mul*rem;
                }
                
          arm=arm+mul;
          t2 =t2/10;
       
            }
            if(arm==num){
                System.out.println("Its a armstong number:"+arm);
            }else{
                System.out.println("Its not an Armstong ");
            }
        
    }
}
