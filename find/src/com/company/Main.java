package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

//        // Get the regex to be checked
//        String regex = ;
//
        // Create a pattern from regex
        Pattern pattern
                = Pattern.compile("\\w+@((?:\\w+\\.)+\\w+)");
//
//        // Get the String to be matched
//        String stringToBeMatched
//                = ;
//
        // Create a matcher for the input String
        Matcher matcher
                = pattern.matcher("GeexForGeexGeex sandris@gmail.com 5544@com kkkkkk@kkkk.com");
//
//        // Get the subsequence
//        // using find() method
//        System.out.println(matcher.find());
//        System.out.println(matcher);
//        System.out.println(stringToBeMatched);
//        System.out.println(pattern);
//        System.out.println(regex);
//
        while (matcher.find()) {
            System.out.println("Result is " + matcher.group());;
        }


        //pattern/expression to be match
//        Pattern  p=Pattern.compile("@gmail");
//        //Regular expression
//        Matcher m=p.matcher("abc@gmail.com");
//        if(m.find()) {
//            System.out.println(" Result :  " + m);
//        }

    }
}
