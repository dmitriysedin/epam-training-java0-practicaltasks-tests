package practicaltasks.task3.exercise2;

import org.junit.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Dmitriy Sedin on 28.10.2018.
 */
public class EffectiveAlgorithmTest {
    @Test
    public void determineMaxNumber() throws Exception {

        int source = 123449;
        int expected = 9;

        int actual = EffectiveAlgorithm.determineMaxNumber(source);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isPalindrome() throws Exception {

        int source = 123432;
        boolean expected = false;

        boolean actual = EffectiveAlgorithm.isPalindrome(source);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isPrimeNumber() throws Exception {

        int source = 1117;
        boolean expected = true;

        boolean actual = EffectiveAlgorithm.isPrimeNumber(source);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void determineOfPrimeNumberDivider() throws Exception {

        int source = 3 * 4 * 5 * 7 * 11 * 13 * 3 * 5 * 7;

        Object[] expected = {2, 3, 5, 7, 11, 13};

        List<Integer> actualList = EffectiveAlgorithm.determineOfPrimeNumberDivider(source);

        Object[] actual = actualList.toArray();

        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void calculationOfGCD() throws Exception {
        int source1 = 50;
        int source2 = 20;
        int expected = 10;

        Assert.assertEquals(10, EffectiveAlgorithm.calculationOfGCD(50, 20));

    }

    @Test
    public void calculationOfLCM() throws Exception {

        int source1 = 50;
        int source2 = 20;
        int expected = 100;

        Assert.assertEquals(100, EffectiveAlgorithm.calculationOfLCM(50, 20));

    }

    @Test
    public void calculationOfDifferentNumber() throws Exception {

        int source = 11223345;
        int expected = 5;

        Assert.assertEquals(5, EffectiveAlgorithm.calculationOfDifferentNumber(source));

    }

}