package com.stringbuffer;

import com.stringbuilder.ReverseAStringUsingStringBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseAStringUsingStringBuilderTest {

    @Test
    public void testReverse() {
        assertEquals("olleh", ReverseAStringUsingStringBuilder.reverse("hello"));
        assertEquals("avaJ", ReverseAStringUsingStringBuilder.reverse("Java"));
        assertEquals("", ReverseAStringUsingStringBuilder.reverse(""));
        assertEquals("a", ReverseAStringUsingStringBuilder.reverse("a"));
        assertEquals("12321", ReverseAStringUsingStringBuilder.reverse("12321"));
        System.out.println("All Test Case Done");
    }
}
