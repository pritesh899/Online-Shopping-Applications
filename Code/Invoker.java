import java.util.ArrayList;
import java.util.List;

public class Invoker 
{
	private List<CommandInterface> orderList = new ArrayList<CommandInterface>();
	
	public void takeOrder(CommandInterface commandInterface){
	      orderList.add(commandInterface);		
	   }
	
	public void placeOrders(int choice){
        String command = "";
          if(choice == 1)
          {
              command = "UPDATE_PROFILE";
              
          }else if(choice == 2)
          {
              command = "BROWSE_ITEMS";
              
          }else if(choice == 3)
          {
              command = "UPDATE_ITEMS";
              
          }else if(choice == 4)
          {
              command = "REMOVE_ITEMS";
              
          }else if(choice == 5)
          {
              command = "ADD_ITEMS";
              
          }else if(choice == 6)
          {
              command = "ADD_ADMIN";
              
          }else if(choice == 33)
          {
              command = "PURCHASE_ITEMS";
              
          }else if(choice == 44)
          {
              command = "ADD_ITEM_CART";
              
          }else
          {
              command = "NONE";
          }
        
	      for (CommandInterface commandInterface : orderList) {
	    	  commandInterface.execute(command);
	      }
	      orderList.clear();
	   }
	
}

