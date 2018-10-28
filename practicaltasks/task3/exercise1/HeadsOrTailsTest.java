package practicaltasks.task3.exercise1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dmitriy Sedin on 27.10.2018.
 */
public class HeadsOrTailsTest {
    @Test
    public void countingHeadsAndTails() throws Exception {

        int numberOfToss = 1000;
        int[] resultArray = HeadsOrTails.countingHeadsAndTails(numberOfToss);

        Assert.assertEquals(resultArray[0] + resultArray[1], numberOfToss);
    }

}