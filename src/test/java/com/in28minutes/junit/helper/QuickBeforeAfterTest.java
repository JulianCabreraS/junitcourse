package com.in28minutes.junit.helper;

import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {
    @Before
    public void setup(){
        System.out.println("Before test");
    }

    @Test
    public void test1(){
        System.out.println("test1 executed");
    }

    @Test
    public void test2(){
        System.out.println("test2 executed");
    }
}
