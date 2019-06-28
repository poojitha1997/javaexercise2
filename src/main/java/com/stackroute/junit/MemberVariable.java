package main.java.com.stackroute.junit;

public class MemberVariable
{
    Member member = new Member();
    public String printValues(String name,int age,double salary)
    {
        member.name=name;
        member.age=age;
        member.salary=salary;
        return "Members name:"+member.name + "members age:"+member.age+"members salary:"+member.salary;
    }
}
