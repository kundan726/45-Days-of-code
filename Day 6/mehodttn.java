package com.codeWithHarry;

public class mehodttn {
    static int shubhu(int x,int y){
        int z;
        int a=7; // changing the value in the method will not change the actual value of 'a' in main method

        if (x>y) {
            z=x+y;
        }
        else {
            z=(x*y)+10;
        }
        return z;
    }

    int pooja(int x,int y){
        int z;

        if (x>y) {
            z=x+y;
        }
        else {
            z=(x*y)+10;
            System.out.println("Pooja loves sleeping");
        }
        return z;
    }

    static void arraytest(int arr[]){
        arr[0]=98;
    }


    // Main Method

    public static void main(String[] args) {

        // 1. Printing values using native way

        int a=5;
        int b=6;
        int c;
        if (a>b) {
            c=a+b;
            System.out.println("Value of z = " + c);
        }
        else {
            c=(a*b)+10;
            System.out.println("Value of z = " + c);
        }


        int x=50;
        int y=6;
        int z;
        if (x>y) {
            z=x+y;
            System.out.println("Value of z = " + z);
        }
        else {
            z=(x*y)+10;
            System.out.println("Value of z = " + z);
        }


        // 2. Printing values using method

         /* Method :- It is just a function which is used in any other programming language

         -> syntax :- datatype method name(parameter){

                      method body statements;

                      }
        */

        /* eg:-

        int shubhu(datatype parameter name - this is optional){
        sout("shubhu loves megan fox");
        return 0;
        }

        or

        void shubhu(){
        sout("shubhu loves megan fox");

        }

                                                                    akshay
        shubham-                                                      pooja
                                                                    DEVANSHU
                                                                    SHIVANI
         */


        /*int a=5;
        int b=6;   these has been intialized above
        int c;
         */

        // -> Printing values using method

         a=5;  //see the above comment
         b=6;

        c=shubhu(a,b);
        System.out.println("Value of c = " + c);

        System.out.println("In the function shubhu() we have changed the valued of 'a' as 'a=7' but that does not mean that the actual value of a has been changed!!!! The actual value of 'a' has not been changed!!!! Let's see");
        System.out.println("Value of a = " + a);

        int u=6;
        int v=7;
        int t;
        t=shubhu(u,v);
        System.out.println("Value of t = " + t);


        int aa1=62;
        int bb1=77;
        int cc1;
        cc1=shubhu(aa1,bb1);  //c=z
        System.out.println(cc1);

         u=6;
         v=7;

         mehodttn pooh=new mehodttn();
         t=pooh.pooja(u,v);
        System.out.println("Value of t = " + t);



//        static void shubhu(int arr[]){
//            arr[0]=98;
//        }


        /* Learning that in case of an array the reference is passed and any changes made on the reference will cahnge the
        originl vale also*/

        int [] marks={10,13,14,15};
        arraytest(marks);
        System.out.println("value of marks[0] " + marks[0]);




    }
}
