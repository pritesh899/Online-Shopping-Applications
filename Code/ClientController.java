

public class ClientController implements CommandInterface 
{
	private ClientMethod clientMethod;
	
	public ClientController(ClientMethod clientMethod)
	{
		this.clientMethod = new ClientMethod();
	}
    
    public static final String UPDATE_PROFILE = "UPDATE_PROFILE";
    public static final String BROWSE_ITEMS = "BROWSE_ITEMS";
    public static final String PURCHASE_ITEMS = "PURCHASE_ITEMS";
    public static final String ADD_ITEM_CART = "ADD_ITEM_CART";
	public void execute(String choice)
	{
		if (choice == UPDATE_PROFILE)
		{
			clientMethod.updateProfile();
            
        }else if(choice == BROWSE_ITEMS)
        {
            clientMethod.browseItems();
            
        }else if(choice == PURCHASE_ITEMS)
        {
            clientMethod.purchaseItems();
            
        }else if(choice == ADD_ITEM_CART)
        {
            clientMethod.addItemInCart();
            
        }
		
	}

}
