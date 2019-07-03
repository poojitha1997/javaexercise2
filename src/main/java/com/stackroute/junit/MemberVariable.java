package main.java.com.stackroute.junit;

//program to access the details of the class member by using the object
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
