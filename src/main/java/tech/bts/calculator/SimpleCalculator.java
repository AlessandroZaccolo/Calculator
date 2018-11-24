package tech.bts.calculator;

public class SimpleCalculator {


    private int value;

    public SimpleCalculator(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void add(int i) {
        value += i;
    }

    public void subtract(int i) {
        value -= i;
    }

    public void multiply(int i) {
        value *= i;
    }

    public void divide(int i) {
        value /= i;
    }

    public int getSign() {

        boolean isPositive = value > 0;
        boolean isZero = value == 0;

        return (isPositive ? 1 : (isZero ? 0 : -1));

        /*
        int sign = -1;

        if (value > 0){
            sign = 1;
        } else if (value == 0){
            sign = 0;
        }

        return sign;
        */
    }

    public int getAbs() {

        boolean isNegative = value < 0;

        return (isNegative ? (-value) : value);

    }

    public int getFactorial() {

        int fac = value;

        for (int i = fac - 1; i >= 1 ; --i) {
            fac *= i;
        }
        return fac;
    }

    public int getSquare() {

        return value * value;
    }

    public int getPower() {

        int exponent = value;

        for (int i = 1; i < exponent; i++) {
            value *= exponent;
        }

        return value;

    }
}
