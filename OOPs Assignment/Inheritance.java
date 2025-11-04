class Person 
{
    String name;

    void setName(String name) 
    {
        this.name = name;
    }

    void displayName() 
    {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person 
{
    String company;

    void setCompany(String company) 
    {
        this.company = company;
    }

    void showDetails() 
    {
        System.out.println(name + " works at " + company);
    }
}

public class Inheritance
{
    public static void main(String[] args) 
    {
        Employee e = new Employee();
        e.setName("Karthik");
        e.setCompany("ABC Finance");
        e.showDetails();
    }
}
