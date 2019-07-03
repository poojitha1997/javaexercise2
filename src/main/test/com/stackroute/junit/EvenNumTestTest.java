package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.EvenNumTest;
import main.java.com.stackroute.junit.PowerCheck;
import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTestTest
{
    EvenNumTest evennumtest;
    @Before
    public void setUp()
    {
        evennumtest = new EvenNumTest();
    }

    @After
    public void tearDown()
    {
        evennumtest=null;
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("Class Creation");
    }

    @Test
    public void testForEven()
    {
        boolean number = evennumtest.isEven(64);
       assertEquals(true,number);
    }

    @Test
    public void testForNotNull()
    {
        boolean number = evennumtest.isEven(64);
        assertNotNull(String.valueOf(false),number);
    }

    @Test
    public void testForNotEven()
    {
        boolean number = evennumtest.isEven(75);
        assertEquals(false,number);
    }



    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("Class Deletion");
    }



}