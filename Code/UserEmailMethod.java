import java.util.Scanner;
public class UserEmailMethod implements MarketUsernameInterface
{
    String loginName;
    Scanner sc=new Scanner(System.in);
    public String DisplayGetUsername()
    {
        System.out.println("Enter the email-id");
        loginName=sc.next();
        return loginName;
    }
}
