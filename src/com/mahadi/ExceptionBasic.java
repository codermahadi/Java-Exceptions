package com.mahadi;


/**
 * Created by Mahadi on 2/7/2018.
 */
public class ExceptionBasic {

    public static void main(String[] args) {

       int i = 10;
       //int j = 2;
       int j = 0;

       try{
           int k = i/j;
           System.out.println(k);

       }catch (ArithmeticException e){

           System.out.println("Cannot divide by 0");

       }

//       End Exception Handled

       System.out.println("Hello Programmer..");
    }
}
