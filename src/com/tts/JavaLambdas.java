package com.tts;

import com.tts.lamdasInterface.IntMath;
import com.tts.lamdasInterface.MathFunctions;

import java.util.ArrayList;

public class JavaLambdas {

    public void arrayStuff() {
        ArrayList<String> studentsArrL = new ArrayList<>();
        studentsArrL.add("Eric");
        studentsArrL.add("Oliver");
        studentsArrL.add("Jacob");
        studentsArrL.add("Jeremiah");
        studentsArrL.add("Renee");
        studentsArrL.add("Vin Cecil");

        studentsArrL.forEach(student -> System.out.println(student));
        System.out.println();
        studentsArrL.forEach(System.out::println);
        System.out.println();

        studentsArrL.forEach(student -> {
                if(student.substring(0,1).equals("J")) {
                    System.out.println("J students = " + student);
                };
        });
        System.out.println();
        studentsArrL.forEach(idx -> {
            if(idx.substring(0,2).equals("Ja")) {
                System.out.println("Ja students = " + idx);
            };
        });
        System.out.println();

    }//end arrayStuff()

    public static void main(String[] args) {

        JavaLambdas myLambdaEx = new JavaLambdas();
        myLambdaEx.arrayStuff();

        MathFunctions mathOp = new MathFunctions();
        System.out.println("sum: " + mathOp.operations(3, 23));

        IntMath subtraction = (a, b) -> a - b;
        System.out.println("difference: " + subtraction.operations(23, 3));

    }//end main()

}//end javaLambdas class

/*
//from Shekeva
//second addition interface with lambda
    interface  IntegerMath{
     public   int operations2(int a,int b);
    }
    public static void main(String[] args) {
        //Math Interface example with lambda
        IntegerMath addition = (a,b)-> a+b;
        int add = addition.operations2(4,4);
        System.out.println("addition with lambda interface "+ add);

        //Math Interface example 1 without lambda
        MathFunctions mathOp = new MathFunctions();
        add = mathOp.operations(4,4);
        System.out.println("second addition without lambda " + add);

 */
