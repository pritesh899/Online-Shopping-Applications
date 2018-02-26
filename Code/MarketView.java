import java.util.Scanner;
// Honor Pledge:
//// I pledge that I have neither given nor
// received any help on this assignment.
//
// -pratnapp
public class MarketView
{
    String loginName;
    Scanner sc=new Scanner(System.in);
  
    //Function for entering type of user id client wants to login
    public int selectUsernameType()
    {
        int type;
        System.out.println("1. User-id \n2. E-mail \n3. Mobile Number");
        System.out.println("Select the option :");
        type = sc.nextInt();
        return type;
    }
    
    
    //Function for displaying the name of the client
    public void Display(String value)
    {
        System.out.println("\n");
        System.out.println("Message from server : Welcome "+value +" !!!!!!");
        System.out.println("\n");
    }
    
    //Funtion for displaying type of login Customer/ Admin
    public int LoginType()
    {
        int type;
        System.out.println("1. Admin Login \n2. Customer Login");
        System.out.println("Select the option :");
        type = sc.nextInt();
        return type;
    }
    
}
