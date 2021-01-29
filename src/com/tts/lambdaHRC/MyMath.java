package com.tts.lambdaHRC;

public class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

//    PerformOperation isOdd = (a) -> {
//        return a % 2 != 0;
//    };

    public static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
    }

    public static PerformOperation isPalindrome() {
        return (int a) ->  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
    }


}//end MyMath class



//    PerformOperation isOdd(): The lambda expression must return T if a number is odd or F if it is even.
//    PerformOperation isPrime(): The lambda expression must return T if a number is prime or F if it is composite.
//    PerformOperation isPalindrome(): The lambda expression must return T if a number is a palindrome or F if it is not.