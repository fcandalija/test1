package com.example;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test of {@link TimeMachine}.
 */
public class TimeMachineTest {
    
    /**
     * Test method for {@link com.example.TimeMachine#isPast(java.util.Date)}.
     */
    @Test
    public void testIsPast()
        throws Exception
    {
        final TimeMachine timeMachine = new TimeMachine();
        
        final Date present = new Date();
        // ensures that past is past
        final Date past = DateUtils.addDays(present, -1);
        // ensures that future is future
        final Date future = DateUtils.addDays(present, 1);
        
        // Sleep shortly to ensure that present is effectively in the past
        Thread.sleep(10);
        
        Assert.assertTrue(timeMachine.isPast(past));
        // modified as in fact the present (defined little earlier) is already in the past :)
        Assert.assertTrue(timeMachine.isPast(present));
        Assert.assertFalse(timeMachine.isPast(future));
    }
        
}
