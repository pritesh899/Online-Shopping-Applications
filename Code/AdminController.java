
public class AdminController implements CommandInterface{
	private AdminMethod adminMethod;
	
	public AdminController(AdminMethod adminMethod)
	{
		this.adminMethod = new AdminMethod();
	}

    public static final String UPDATE_PROFILE = "UPDATE_PROFILE";
    public static final String BROWSE_ITEMS = "BROWSE_ITEMS";
    public static final String UPDATE_ITEMS = "UPDATE_ITEMS";
    public static final String REMOVE_ITEMS = "REMOVE_ITEMS";
    public static final String ADD_ITEMS = "ADD_ITEMS";
    public static final String ADD_ADMIN = "ADD_ADMIN";
	public void execute(String choice)
	{
        if (choice == UPDATE_PROFILE)
        {
            adminMethod.updateProfile();
            
        }else if(choice == BROWSE_ITEMS)
        {
            adminMethod.browseItems();
            
        }else if(choice == UPDATE_ITEMS)
        {
            adminMethod.updateItems();
            
        }else if(choice == REMOVE_ITEMS)
        {
            adminMethod.removeItems();
            
        }else if(choice == ADD_ITEMS)
        {
            adminMethod.addItems();
            
        }else if(choice == ADD_ADMIN)
        {
            adminMethod.addAdmin();
        }
	}
}

