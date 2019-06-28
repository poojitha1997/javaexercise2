package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.PowerCheck;
import org.junit.*;

import static org.junit.Assert.*;

public class PowerCheckTest
{
    PowerCheck check;
    @Before
    public void setUp()
    {
        check = new PowerCheck();
    }

    @After
    public void tearDown()
    {
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("Class Creation");
    }

    @Test
    public void testForPower()
    {
        String number = check.checkPower(64);
        assertEquals("it is power of 4",number);
    }
    @Test
    public void testForNotPower()
    {
        String number = check.checkPower(70);
        assertEquals("it is not a power of 4",number);
    }



    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("Class Deletion");
    }



}