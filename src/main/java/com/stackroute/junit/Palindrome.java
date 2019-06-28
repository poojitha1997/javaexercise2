package main.java.com.stackroute.junit;

public class Palindrome
{
    public String checkPalindrome(String input) {
        if(input.equals(""))
            return "Enter the data";
        else
        {
            String reverse = "";

            int length = input.length();

            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + input.charAt(i);

            if (input.equals(reverse))
                return "The string is a palindrome.";
            else
                return "The string is not a palindrome.";
        }

    }

}
