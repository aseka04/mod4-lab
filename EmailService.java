package lab;

class EmailService implements Notification
{
    public void Send(String message)
    {
        System.out.println("Отправка Email: "+message);
    }
}


interface Notification{
    public void Send(String message);
}