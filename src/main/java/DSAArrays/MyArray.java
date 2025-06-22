package DSAArrays;

import java.sql.Array;
import java.util.Arrays;

public class MyArray {

    public static void main(String[] args) {

//       1. Introduction to Arrays

        int[] numbers = new int[5];

        numbers[0] = 7;
        numbers[1] = 12;
        numbers[2] = 9;
        numbers[3] = 4;
        numbers[4] = 1;

        System.out.println("Number at index 0 is: " + numbers[0]);

        for (int number : numbers) {
            System.out.println(number);
        }

//        2. Algorithm: Finding The Lowest Value in an Array

//        A. How it works:
//        Go through the values in the array one by one.
//        Check if the current value is the lowest so far, and if it is, store it.
//        After looking at all the values, the stored value will be the lowest of all values in the array.

//        B. Before implementing the algorithm using an actual programming language, it is usually smart to first write the algorithm as a step-by-step procedure.

//        a. Create a variable 'minVal' and set it equal to the first value of the array.
//        b. Go through every element in the array.
//        c. If the current element has a lower value than 'minVal', update 'minVal' to this value.
//        d. After looking at all the elements in the array, the 'minVal' variable now contains the lowest value.

//        C. Let's write it in a way that is closer to what a computer programming language would write

//        Variable minVal = myArray [0];
//        for each element inside myArray
//        if current element < minVal
//        minVal = current element

//        D. Let's implement it now

        int[] myGrades = new int[5];

        myGrades[0] = 70;
        myGrades[1] = 120;
        myGrades[2] = 90;
        myGrades[3] = 40;
        myGrades[4] = 110;


        int minVal = myGrades[0];

        for (int myGrade : myGrades) {
            if (myGrade < minVal) {
                minVal = myGrade;
                System.out.println("The Lowest Value is: " + minVal);
            }


        }
    }
}
