package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.PowerCheck;
import main.java.com.stackroute.junit.StudentGrade;
import org.junit.*;

import static org.junit.Assert.*;

public class StudentGradeTest
{
    StudentGrade object;
    @Before
    public void setUp() throws Exception {
        object=new StudentGrade();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void getNumberOfStudentAndGrades()
    {
        int Grades[] = {86,65,98,77};
        String Result = object.readGradeInput(4,Grades);
        assertEquals("The average is 81.5 The minimum is 65 The maximum is 98",Result);
    }

    @Test
    public void getAvg()
    {
        String Avg = object.avg(410,4);
        assertEquals("102.5",Avg);
    }

    @Test
    public void getMin()
    {
        int Grades[] = {86,65,98,77};
        int Min = object.min(Grades,4);
        assertEquals(65,Min);
    }

    @Test
    public void geMax()
    {
        int Grades[] = {86,65,98,77};
        int Max = object.max(Grades,4);
        assertEquals(98,Max);
    }

    @Test
    public void wrongInputTest1()
    {
        int Grades[] = {55,99,67,99};
        String Result = object.readGradeInput(99,Grades);
        assertEquals("Wrong Input",Result);
    }

    @Test
    public void wrongInputTest2()
    {
        int Grades[] = {55,141,67,99};
        String Result = object.readGradeInput(89,Grades);
        assertEquals("Wrong Input",Result);
    }

    @Test
    public void wrongInputTest3()
    {
        int Grades[] = {55,89,67,99};
        String Result = object.readGradeInput(209,Grades);
        assertEquals("Wrong Input",Result);
    }

}