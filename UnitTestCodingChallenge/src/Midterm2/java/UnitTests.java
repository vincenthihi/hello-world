package Midterm2.java;

import java.util.Scanner;

/**Vincent Nguyen
 * CS108
 * 4/16/2020
 */

public class UnitTests {

    public static void main(String args[]) {
        multiplyTest();
        divideTest();
        calculateTest();
    }

    /**
     * Calling Methods(All Static) and Testing inputs
     *
     * Created a try-catch-throw block for divisor of zero
     */
    public static void multiplyTest() {
        MiniCalculator testM = new MiniCalculator();
        testM.multiply(2);

        if (testM.getSum() != 2) {
            System.out.println("FAILED: Try again!");
        } else {
            System.out.println("PASSED: Sum equals 2, Congrats!");
        }
    }

    public static void divideTest() {
        MiniCalculator testD = new MiniCalculator();
        try {
            testD.divide(0);
            if (testD.getSum() != 1) {
                System.out.println("FAILED: Try again!");
            } else {
                System.out.println("PASSED: Sum equals 1, Congrats!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Creating a simple calculation
     * 5*5/5=1
     */
    public static void calculateTest() {
        MiniCalculator testC = new MiniCalculator();
        try {
            testC.multiply(5);
            testC.divide(5);


            if (testC.getSum() != 1) {
                System.out.println("FAILED: Try again!");
            } else {
                System.out.println("PASSED: Sum equals 1, Congrats!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Unit tests completed");
        }
    }
}



