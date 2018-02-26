import java.rmi.Naming;

// Honor Pledge:
//// I pledge that I have neither given nor
// received any help on this assignment.
//
// -pratnapp
public class MarketPlaceController
{
    private Market model;
    private MarketView view;
    private MarketPlaceDispatcher dispatcher;
        
    // Model-View Glue
    public MarketPlaceController(Market model, MarketView view)
    {
        this.model = model;
        this.view = view;
        dispatcher = new MarketPlaceDispatcher();
    }
        
    boolean Username;
    String User;
    String request;
    int type;
    int userNameType;
    String password;
    
    //For storing the value
    String request1;
    
    private boolean isAuthenticUser(boolean yes){
        if(yes == true)
        {
            System.out.println("User is authenticated successfully.");
            return true;
        }
        else{
            System.out.println("User is not authenticated.");
            return false;
        }
    }
    
    private String LoginType(int Type)
    {
            if(Type == 1)
            {
                request = "admin";
                return request;
            }
            else if (Type == 2)
            {
                request = "client";
                return request;
            }
            else{
                return null;
            }
    
    }
    private void trackRequest(String request){
        System.out.println("Page requested: "+request );
    }
    
    public void steps()
    {
        
        try
        {
            //Type of login
            type = view.LoginType();
            
            userNameType = view.selectUsernameType();
            //type of request processing
            request1 =  LoginType(type);
            
            MarketAbstractFactory Factory = FactoryProducer.getFactory("USERNAME");
            if(userNameType == 1)
            {
                MarketUsernameInterface usernameinterface = Factory.getUsername("USERNAME");
                User = usernameinterface.DisplayGetUsername();
                
            }else if (userNameType == 2)
            {
            MarketUsernameInterface usernameinterface = Factory.getUsername("EMAIL");
            User = usernameinterface.DisplayGetUsername();
            }else if( userNameType == 3)
            {
                MarketUsernameInterface usernameinterface = Factory.getUsername("NUMBER");
                User = usernameinterface.DisplayGetUsername();
            }else{
                System.out.println("Enter correct user type");
            }
            
            
            MarketAbstractFactory Factory2 = FactoryProducer.getFactory("PASSWORD");
            
            MarketPasswordInterface passwordinterface = Factory2.getPassword("PASSWORD");
            password = passwordinterface.DisplayGetPassword();
            
            
             //Entering the name from the client and calling the function in marketview class
            //User = view.EnterName();
            
           // password = view.EnterPassword();
            
            //Passing the user input to the server
            Username = model.verify_user(type,User,password);

            //Tracking the request
            trackRequest(request1);
            
            //Authentication user
            if(isAuthenticUser(Username))
            {
                view.Display(User);
                dispatcher.dispatch(request1);
            }
            
            //Displaying the output recieved from the server through MarketView class
           // view.Display(Username);
        }
        catch(Exception e)
        {
            System.out.println("MarketClient Exception: " +
            e.getMessage());
            e.printStackTrace();
		}
		
		System.exit(0);
	}
}
