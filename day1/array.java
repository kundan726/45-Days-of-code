package com.codeWithHarry;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        /* How we can create an array
        1.  datatype [] reference variable = new datatype[size or n];
            int [] class= new int[5];

        2. datatype[] reference variable;
           reference variable = new datatype[size or n];

        3.  datatype[] reference variable = {13,45,56,78};
        */
        int[] students = new int[5];
        students[0]=45;
        students[1]=445;
        students[2]=895;
        students[3]=75;
        students[4]=715;

        //printing the output of array using conventional method
        System.out.println("printing the output of array using conventional method");
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);

//        length method
        System.out.println("Length of an array");
        System.out.println(students.length);

        //printing the output of array using for method
        System.out.println("printing the output of array using for method");
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        //printing values of array using foreach loop
        System.out.println("printing values of array using foreach loop");
        for (int marks:students){
            System.out.println(marks);
        }

        //printing the values using toString Method
        //Remember to use import java.util.Arrays;
        System.out.println("printing the values using toString Method");
        System.out.println(Arrays.toString(students));



    }
}
