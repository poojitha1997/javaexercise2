package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.UpperCase;
import org.junit.*;

import static org.junit.Assert.*;

public class UpperCaseTest
{
    UpperCase object;
    @Before
    public void setUp() throws Exception {
        object=new UpperCase();
    }

    @After
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
    public void testForDataFromFile() throws Exception {
        String t=object.readFileAsString("/home/poojitha/Desktop/Data.txt");
        assertEquals("THIS IS TXT FILE\n" +
                "17",t);
    }



    @Test
    public void testForFileLocationNotFound() throws Exception {
        String t=object.readFileAsString("/home/poojitha/Desktop/Bata.txt");
        assertEquals("File location not found",t);
    }

}