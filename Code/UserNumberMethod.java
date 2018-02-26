import java.util.Scanner;
public class UserNumberMethod implements MarketUsernameInterface
{
    String loginName;
    Scanner sc=new Scanner(System.in);
    public String DisplayGetUsername()
    {
        System.out.println("Enter the mobile number");
        loginName=sc.next();
        return loginName;
    }
}

