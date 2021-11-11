package com.company;
import java.util.*;
public class primeNo {
    
    public static void main(String[] args) {

    // 1. Approach 1 -> In this approach we have used simple logic that if a no. has more than 2 factor it cannot be a prime no. but this is not an optimized approach


    //    Scanner sc = new Scanner(System.in);
    //    int t=sc.nextInt();
       
    //    for (int i = 0; i < t; i++) {
    //        int n = sc.nextInt();


    //        int count=0;
    //        for(int div=1; div<=n; div++){
    //            if(n%div==0){
    //                count++;
    //            }
    //        }
    //        if(count==2){
    //            System.out.println("Prime");
    //        }
    //        else{
    //            System.out.println("Not Prime");
    //        }
    //    }


    // 2. Approach 2 -> In this approach we are going to optimize the previous code and we do by using the concept that 
    // Scanner sc = new Scanner(System.in);
    //    int t=sc.nextInt();
       
    //    for (int i = 0; i < t; i++) {
    //        int n = sc.nextInt();


    //        int count=0;
    //        for(int div=2; div*div<=n; div++){
    //            if(n%div==0){
    //                count++;
    //            }
    //        }
    //        if(count==0){
    //            System.out.println("Prime");
    //        }
    //        else{
    //            System.out.println("Not Prime");
    //        }
    //    }

    // 3. Approach 3 -> More Optimized
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    
    for (int i = 0; i < t; i++) {
        int n = sc.nextInt();


        int count=0;
        for(int div=2; div*div<=n; div++){
            if(n%div==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    }
}
