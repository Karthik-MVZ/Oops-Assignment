class Greeting 
{
    void sayHello() 
    {
        System.out.println("Hello from Greeting");
    }
}

class EnglishGreeting extends Greeting 
{
    void sayHello() 
    {
        System.out.println("Hello!");
    }
}

class TamilGreeting extends Greeting 
{
    void sayHello() 
    {
        System.out.println("Vanakkam!");
    }
}

public class Polymorphism
{
    public static void main(String[] args) 
    {
        Greeting g1 = new EnglishGreeting();
        Greeting g2 = new TamilGreeting();

        g1.sayHello();
        g2.sayHello();
    }
}
