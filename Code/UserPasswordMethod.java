import java.util.Scanner;

public class UserPasswordMethod implements MarketPasswordInterface
{
    String password;
    Scanner sc=new Scanner(System.in);

    public String DisplayGetPassword()
    {
        System.out.println("Enter the password");
        password=sc.next();
        return password;
    }
}
