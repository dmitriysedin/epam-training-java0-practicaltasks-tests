package practicaltasks.task3.exercise3;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by Dmitriy Sedin on 28.10.2018.
 */
public class PerfectNumberTest {
    @Test
    public void isPerfectNumber() throws Exception {

        int source = 8128;
        boolean expected = true;

        Assert.assertEquals(expected, PerfectNumber.isPerfectNumber(8128));
    }

}