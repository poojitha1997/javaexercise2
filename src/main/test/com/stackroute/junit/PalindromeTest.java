package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.Palindrome;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest
{
    Palindrome object;

    @org.junit.Before
    public void setUp() throws Exception {
        object=new Palindrome();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        object=null;
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("Class Creation");
    }

    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("Class Deletion");
    }
    @Test
    public void testForNullString()
    {
        String t=object.checkPalindrome("");
        assertEquals("Enter the data",t);
    }
    @Test
    public void testForStringIsPalinddrome()
    {
        String t=object.checkPalindrome("madam");
        assertEquals("The string is a palindrome.",t);
    }
    @Test
    public void testForStringIsNotPalinddrome()
    {
        String t=object.checkPalindrome("hey");
        assertEquals("The string is not a palindrome.",t);
    }


}