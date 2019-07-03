package main.java.com.stackroute.junit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//program to find the file ,convert it to uppercase and print the length of the content
public class UpperCase
{
    public String readFileAsString(String fileName)throws Exception
    {
        int len;
        try {
            String data = " ";

            data = new String(Files.readAllBytes(Paths.get(fileName))); //reading the file
            data=data.toUpperCase();
            len=data.length();

            return data+len; //returning the length of the content
        }
        catch (IOException e) {
            e.printStackTrace();
            return "File location not found"; //return if the file is not found
        }
    }

}
