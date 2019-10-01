package com.in28minutes.junit.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {
    StringHelper helper;

    @Before
    public void before(){
        helper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_Condition(){
        //AACD => CD ACD => CD CDEF=>CDEF CDAA=> CDAA

        String actual = helper.truncateAInFirst2Positions("AACD");
        assertEquals("CD", actual);
        //expected, actual
    }

    @Test
    public void testAreFirstAndLastTwoCharactewrsTheSame_BasicNegativeScenario(){
        //AssertFalse
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
    @Test
    public void testAreFirstAndLastTwoCharactewrsTheSame_BasicPositiveScenario(){
        //AssertFalse
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

}