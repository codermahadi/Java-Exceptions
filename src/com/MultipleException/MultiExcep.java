package com.MultipleException;

/**
 * Created by Mahadi on 2/7/2018.
 */
public class MultiExcep {

    public static void main(String[] args) {

        int i = 10;
        int j = 2;
        //int j = 0;

        int[] myArray = new int[4];


        try{
            int k = i/j;
            System.out.println(k);

//           For Array Statement

            for (int x = 0; x < 5; x++){
                myArray[x] = x+1;
            }

            for(int value : myArray){
                System.out.println(value);
            }

        }catch (ArithmeticException e){

            System.out.println("Cannot divide by 0");

        }catch (ArrayIndexOutOfBoundsException ae){

            System.out.println("Maximum Number of Value is 4");
        }

//       End Exception Handled

        System.out.println("Hello Programmer..");
    }
}
