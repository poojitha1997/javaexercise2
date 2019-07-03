package main.java.com.stackroute.junit;

//program to check if the  number is the power of four
public class PowerCheck
{
    public String checkPower(int num)
    {
        int sum=1;
        for(int i=0;i<num;i++){
            sum=sum*4;
            if(sum==num)
            {
                return "it is power of 4";
            }

        }
        return "it is not a power of 4"; //return in the case the number is not the power of 4
    }

}
