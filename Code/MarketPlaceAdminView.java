import java.util.Scanner;

public class MarketPlaceAdminView
{
    //MarketPlaceDispatcher marketPlaceDispatcher = new MarketPlaceDispatcher();
    int choice;
    Scanner sc=new Scanner(System.in);

    public void show()
    {
        System.out.println("Displaying Admin Page");
        
    }
    
    public int chooseOption()
    {
        System.out.println("\n 1. Update Profile \n2. Browse Items \n3. Update Items \n4. Remove Items \n5. Add Items \n6.Add Admin");
        System.out.println("Enter the choice :");
        choice = sc.nextInt();
        return choice;
    }
}
