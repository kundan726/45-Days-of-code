package com.codeWithHarry;
import java.util.Arrays;
import java.util.*;

public class Multidimensional_array {
    public static void main(String[] args) {
        int [][] house=new int[2][3];
        house[0][0]=101;
        house[0][1]=102;
        house[0][2]=101;
        house[1][0]=201;
        house[1][1]=202;
        house[1][2]=203;
        

        System.out.println("enter the elements for an array");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(house[i][j] + "\t");
//                System.out.println(" ");
            }
            System.out.println(" ");
        }


// Taking input from user
        System.out.println("Enter the size of an array");
        Scanner sc=new Scanner(System.in);
        int i,j;
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][]=new int[m][n];
//        System.out.println(arr[m][n]);
        System.out.println("Enter The contents of row and column");
        //Loop for entering the elememts of an array

        for ( i=0;i<m;i++){
            for ( j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
//
            }
//
        }

        /*Loop for printing the elements of and but their is an error in this part that needs to be
        corrected
         */
        
        for (i = 0; i < m; i++) {
            for (j = 0; j <n ; j++) {
                System.out.println(arr[i][j]);
            }
        }
	//code added by shubham
	System.out.print("Enter the no. of Rows : ");
        int x = sc.nextInt();
        System.out.print("Enter the no. of Columns : ");
        int y = sc.nextInt();

        int house[][] = new int[x][y];

        int i, j;
        System.out.println("\nEnter the elements of array :");
        for (i=0; i<x; i++){
            for (j=0; j<y; j++){
                System.out.print("Element [" + i + "][" + j + "] : ");
                house[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe elements of array are :");
        for (i=0; i<x; i++){
            for (j=0; j<y; j++){
                System.out.print(house[i][j] + "\t");
            }
            System.out.println("\n");
        }
	//changes

    }
}
