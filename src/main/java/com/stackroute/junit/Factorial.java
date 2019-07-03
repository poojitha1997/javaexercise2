package main.java.com.stackroute.junit;

import java.math.BigDecimal;

//program to print the factorial of the highest possible numbers in range
public class Factorial
{
    BigDecimal ob = new BigDecimal("234567890000000987654321234567");
    BigDecimal ob2 = new BigDecimal("123456789009876543232456");

    //the method for the long decimals
    public String longFactorial() {
        String outp = "";
        BigDecimal ob1 = new BigDecimal(1);
        System.out.println("List of factorials under long value is");
        for (int i = 1; ; i++) {
            if (ob1.compareTo(new BigDecimal(Long.MAX_VALUE)) < 0 && ob1.multiply(new BigDecimal(i + 1)).compareTo(new BigDecimal(Long.MAX_VALUE)) < 0) {
                ob1 = ob1.multiply(new BigDecimal(i));
                System.out.println(i);
                outp = outp + i;
                outp = outp + "\n";

            } else {
                break;
            }
        }
        return outp;

    }

    //the method for the int numbers
    public String intFactorial() {
        String outp = "";
        BigDecimal ob1 = new BigDecimal(1);
        BigDecimal ob2;
        int j = 1;
        System.out.println("List of factorials under int value is");
        for (int i = 1; ; ) {
            if (ob1.compareTo(new BigDecimal(Integer.MAX_VALUE)) < 0 && ob1.multiply(new BigDecimal(i + 1)).compareTo(new BigDecimal(Integer.MAX_VALUE)) < 0) {
                ob2 = ob1;

                ob1 = ob1.multiply(new BigDecimal(i));
                System.out.println(i);
                outp = outp + i;
                outp = outp + "\n";

            } else {
                break;
            }
            i++;
        }
        return outp;


    }
}
