import java.util.Scanner;
public class UserUsernameMethod implements MarketUsernameInterface
{
    String loginName;
    Scanner sc=new Scanner(System.in);
    public String DisplayGetUsername()
    {
        System.out.println("Enter the Username");
        loginName=sc.next();
        return loginName;
    }
}
