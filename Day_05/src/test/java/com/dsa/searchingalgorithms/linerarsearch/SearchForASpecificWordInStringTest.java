package com.dsa.searchingalgorithms.linerarsearch;

import com.dsa.searchingalgorithm.linearsearch.searchspecificword.SearchForASpecificWordInString;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchForASpecificWordInStringTest {

    @Test
    public void testSearchForASpecificWordInString() {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

        assertEquals("banana", SearchForASpecificWordInString.searchForASpecificWordInString(words, "banana"));
        assertEquals("apple", SearchForASpecificWordInString.searchForASpecificWordInString(words, "apple"));
        assertEquals("Not Found", SearchForASpecificWordInString.searchForASpecificWordInString(words, "grape"));
        assertEquals("cherry", SearchForASpecificWordInString.searchForASpecificWordInString(words, "cherry"));
        assertEquals("Not Found", SearchForASpecificWordInString.searchForASpecificWordInString(words, "mango"));

        System.out.println("All Test Cases Passed!");
    }
}
