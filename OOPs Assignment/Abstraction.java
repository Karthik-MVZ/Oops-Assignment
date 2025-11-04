abstract class Message 
{
    abstract void sendMessage(String text);

    void showSender() 
    {
        System.out.println("Sender");
    }
}

class EmailMessage extends Message 
{
    void sendMessage(String text) 
    {
        System.out.println(text);
    }
}

public class Abstraction
{
    public static void main(String[] args) 
    {
        Message msg = new EmailMessage();
        msg.showSender();
        msg.sendMessage("Hello Karthik!");
    }
}