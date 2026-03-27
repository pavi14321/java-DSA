//Variables 
public class variable
{
    public static void main(String args[])
    {
        double Principle;
        double Rate;
        double Intrest;

        Principle = 17000;
        Rate = 0.07;
        Intrest = Principle * Rate;
        Principle = Principle + Intrest;


    System.out.println("The Intrest is $" +Intrest);
    System.out.println("Principle after 1 year is $" +Principle);
    }
}