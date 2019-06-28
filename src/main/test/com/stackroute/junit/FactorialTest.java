package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.Factorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest
{
    Factorial ob;
    @Before
    public void setUp() throws Exception {
        ob=new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void longFactorialCheck() {
        String res=ob.longFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",res);
    }
    @Test
    public void intFactorialCheck() {
        String res=ob.intFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n",res);
    }


}