package DSAArrays;

public class FibonacciNumbersAlgorithmUsingForLoop {
    public static void main(String[] args){


//        1. HOW THE FIBONACCI WORKS

//        The two first Fibonacci numbers are 0 and 1, and the next Fibonacci number is always the sum of the two previous numbers,
//        so we get 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

//        2. We can implement solutions to find Fibonacci numbers in three different ways:

//        a. An implementation of the Fibonacci algorithm above using a for loop.
//        b. An implementation of the Fibonacci algorithm above using recursion.
//        c. Finding the nth Fibonacci number using recursion.

//        2.a Implementation Using a For Loop
//          Let's list what the code must contain before we program it:
//          - Two variables to hold the previous two Fibonacci numbers
//          - A for loop that runs 18 times
//          - Create new Fibonacci numbers by adding the two previous ones
//          - Print the new Fibonacci number
//          - Update the variables that hold the previous two fibonacci numbers

        int fib1 = 0;
        int fib2 = 1;

        System.out.println(fib1);
        System.out.println(fib2);

        for (int i = 0; i < 18; i++) {

           int newFib = fib1 + fib2;

           System.out.println(newFib);

           fib1 = fib2;

           fib2= newFib;
        }


//        2.b Implementation Using Recursion. Recursion is when a function calls itself.

//           To implement the Fibonacci algorithm we need most of the same things as in the code example above,
//           but we need to replace the for loop with recursion. To replace the for loop with recursion, we need to encapsulate much of the code in a function,
//           and we need the function to call itself to create a new Fibonacci number as long as the produced number of Fibonacci numbers is below, or equal to, 19.
    }
}
