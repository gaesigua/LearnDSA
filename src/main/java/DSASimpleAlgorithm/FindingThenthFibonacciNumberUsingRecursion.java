package DSASimpleAlgorithm;

public class FindingThenthFibonacciNumberUsingRecursion {

    public static void main(String[] args) {

        System.out.println(FindingThenthFunction(8));;

    }

    public static int FindingThenthFunction(int n) {

        if (n <= 1) {

            return n;

        } else {
            return FindingThenthFunction(n - 1) + FindingThenthFunction(n - 2);
        }

    }
}
