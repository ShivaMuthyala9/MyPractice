package com.practice;

import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        assignment();  }

    public static void endsWithA() {
        String[] names = { "Shiva", "Shankar", "Rama", "Suresh", "Ramesh" };
        Arrays.stream(names)
                .filter(name -> name.endsWith("A"))
                .forEach(name -> System.out.println(name.toUpperCase()));
    }

    public static void greaterThan20() {
        int[] numbers = { 234, 324, 234, 12, 13, 54, 12, 43, 564, 19, 20, 23, 45, 67, 89, 90 };
        Arrays.stream(numbers).filter(number -> number > 20).forEach(number -> System.out.println(number));
    }

    public static void fruitsStartsWithA() {
        String[] fruits = { "Apple", "Banana", "Avocado", "Mango", "Apricot", "Pineapple" };
        Arrays.stream(fruits).filter(fruit -> fruit.startsWith("A")).forEach(fruit -> System.out.println(fruit));
    }

    public static void toUppercase(){
        String[] words ={"hello", "world"};
        Arrays.stream(words).forEach(word->System.out.println(word.toUpperCase()));
    }

    public static void assignment(){
        int[] values ={2,5,3,5,2,7,8,4,6,9,1};
        Arrays.stream(values).distinct().sorted().forEach(value->System.out.println(value));
    }
}