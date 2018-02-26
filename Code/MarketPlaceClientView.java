import java.util.Scanner;

public class MarketPlaceClientView
{
    int choice;
    Scanner sc=new Scanner(System.in);
    
    public void show(){
        System.out.println("Displaying Client Page");
        
    }
    public int chooseOption()
    {
        System.out.println("Enter the choice \n1. Update Profile \n2. Browse Items \n3. Purchase Items \n4. Add items in cart");
        System.out.println("Enter the choice :");
        choice = sc.nextInt();
        if(choice == 3)
        {
            int choice1 = 33;
            return choice1;
        }else if(choice == 4)
        {
            int choice1 = 44;
            return choice1;
        }else
        {
            return choice;
        }
        
    }

}
