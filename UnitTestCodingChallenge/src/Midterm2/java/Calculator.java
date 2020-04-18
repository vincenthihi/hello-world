package Midterm2.java;
/**Vincent Nguyen
 * CS108
 * 4/16/2020
 */

public abstract class Calculator implements Multiplier, Divider {
    protected int total;

    /**
     * Initializing the field "total" to 1
     */
    Calculator() {
        total = 1;
    }

    /**
     * Getters&Setters created for total
     */
    public int getSum() {
        return total;
    }

    public void setSum(int sum) {
        this.total = sum;
    }

    /**
     * Implemented methods (Multiply & Divide)
     */
    @Override
    public void multiply(int y) {
        total = total * y;

    }

    @Override
    public void divide(int y) {
        if (y == 0){
            throw new IllegalArgumentException("Error: Cannot divide by zero"); //error exception for divisor 0
        }
        else {
            total = total / y;
        }
    }

        public abstract int calculate();
}

