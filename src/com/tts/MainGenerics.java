package com.tts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainGenerics {

    public static void main(String[] args) {

        // generics is the angle brackets allows us more freedom
        ArrayList<Integer> myList = new ArrayList<>();

        // creating a new instance of the class
        AnotherClass<Integer, String> myClass = new AnotherClass<>(12, "Hey Hey");

        // so with generics we can name the string and int here instead of on the
        // AnotherClass page
//        int numVal = (int) myClass.getThingOne();
//        String strVal = (String) myClass.getThingTwo();
        //this uses generics
        int numVal = myClass.getThingOne();
        String strVal = myClass.getThingTwo();

        System.out.println("Printing everything:");
        System.out.println("numVal: " + numVal);
        System.out.println("strVal: " + strVal);

        //
        Set<String> newSet = new HashSet<>();
        newSet.add("One");
        newSet.add("Two");
        newSet.add("Java");

        Set<String> newSet2 = new HashSet<>();
        newSet2.add("One");
        newSet2.add("Two");
        newSet2.add("Spring");

        //print everything once iterator runs over the entire hashtag
        Set<String> setResult = printStuff(newSet, newSet2);
//        Iterator<String> myItr = setResult.iterator();
//        while(myItr.hasNext()) {
//            System.out.println(myItr.next());
//        }
//        above turned into enhanced for loop
        for (String s : setResult) {
            System.out.println(s);
        }

    }//end main()

    public static <E>Set<E> printStuff(Set<E> setOne, Set<E> setTwo) {

        Set<E> result = new HashSet<>(setOne);
        result.addAll(setTwo);
        System.out.println("result: " + result);
        return result;
    }


}//end MainGenerics class
