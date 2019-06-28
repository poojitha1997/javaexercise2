package main.java.com.stackroute.junit;

public class PowerCheck
{
    public String checkPower(int num)
    {
        int sum=1;
        for(int i=0;i<num;i++){
          //  System.out.println("ji");
            sum=sum*4;
           // sum= i*4;
            if(sum==num)
            {
                System.out.println(sum);
                return "it is power of 4";
               // break;
            }

        }
    //    if(sum==num)
      //      System.out.println("hi");
        return "it is not a power of 4";
    }

}
