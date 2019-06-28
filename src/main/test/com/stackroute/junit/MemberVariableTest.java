package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.MemberVariable;
import main.java.com.stackroute.junit.PowerCheck;
import org.junit.*;

import static org.junit.Assert.*;

public class MemberVariableTest
{
    MemberVariable memvar;
    @Before
    public void setUp()
    {
        memvar = new MemberVariable();
    }

    @After
    public void tearDown()
    {
        memvar=null;
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("Class Creation");
    }

    @Test
    public void printDetails()
    {
        String number = memvar.printValues("poojitha",21,74394);
        assertEquals("Members name:poojitha "+"\n"+"members age:21 "+"\n"+"members salary:74394",number);
    }



    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("Class Deletion");
    }



}