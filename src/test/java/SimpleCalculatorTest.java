import org.junit.Test;
import tech.bts.calculator.SimpleCalculator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    /*
    tech.bts.calculator.
    SimpleCalculator calc = new tech.bts.calculator.SimpleCalculator(0); // starts with value 0
    calc.add(2); // value now is 2
    calc.add(1); // value now is 3
    calc.multiply(4); // value now is 12
    calc.subtract(3); // value now is 9
    calc.divide(2); // value now is 4 (integer division)
    int x = calc.getValue() // should return 4

    Write 4 simple tests to check:
    add
    subtract
    multiply
    divide
    Then another test that checks a combination of all the operations.


    Optional ideas (follow also the TDD rules):

    - Implement a new method getSign(). That method should return 1, 0 or -1 if the value is positive, zero or negative.
    - Write another method abs, which turns the current value into its absolute value.
    - Write other methods like factorial, square and power (exponentiation).
     */

    @Test
    public void test_add(){

        //calc.add(2); // value now is 2

        SimpleCalculator calc = new SimpleCalculator(0);

        calc.add(2);

        assertThat(calc.getValue(), is(2));

    }

    @Test
    public void test_multiply(){

        // calc.add(1); // value now is 3

        SimpleCalculator calc = new SimpleCalculator(2);

        calc.multiply(3);

        assertThat(calc.getValue(), is(6));

    }

    @Test
    public void test_subtract(){

        // calc.add(1); // value now is 3

        SimpleCalculator calc = new SimpleCalculator(100);

        calc.subtract(80);

        assertThat(calc.getValue(), is(20));

    }

    @Test
    public void test_divide(){

        // calc.add(1); // value now is 3

        SimpleCalculator calc = new SimpleCalculator(10);

        calc.divide(2);

        assertThat(calc.getValue(), is(5));
    }

    @Test
    public void test_all_together(){
        SimpleCalculator calc = new SimpleCalculator(0);

        calc.add(2); // value now is 2
        calc.add(1); // value now is 3
        calc.multiply(4); // value now is 12
        calc.subtract(3); // value now is 9
        calc.divide(2); // value now is 4

        assertThat(calc.getValue(), is(4));
    }

    @Test
    public void test_number_sign(){


        SimpleCalculator calc = new SimpleCalculator(5);

        assertThat(calc.getSign(), is(1));
    }


    @Test
    public void test_abs(){

        // Write another method abs, which turns the current value into its absolute value.

        SimpleCalculator calc = new SimpleCalculator(-44);

        assertThat(calc.getAbs(), is(44));
    }

    @Test
    public void test_factorial(){


        SimpleCalculator calc = new SimpleCalculator(5);

        assertThat(calc.getFactorial(), is(120));
    }

    @Test
    public void test_square(){


        SimpleCalculator calc = new SimpleCalculator(8);

        assertThat(calc.getSquare(), is(64));
    }

    @Test
    public void test_power(){


        SimpleCalculator calc1 = new SimpleCalculator(6);

        assertThat(calc1.getPower(), is(46656));
    }
}