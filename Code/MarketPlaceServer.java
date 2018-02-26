import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Honor Pledge:
//// I pledge that I have neither given nor
// received any help on this assignment.
//
// -pratnapp
public class MarketPlaceServer extends UnicastRemoteObject implements Market {
	private String name;
    private String User;

	public MarketPlaceServer(String name) throws RemoteException {
		super(); 
		this.name = name;
	}
    
    /**
	 * Implemented remote method from Market interface.
	 */
/*	public synchronized String get_username(String User) throws RemoteException {
        MarketPlaceLogic lc = new MarketPlaceLogic();
        return lc.checkUser(User);
	}
    */
    //new interface
    public synchronized boolean verify_user(int type,String User,String password) throws RemoteException {
        MarketPlaceLogic lc = new MarketPlaceLogic();
        return lc.checkUser(type, User, password);
    }
	public static void main(String args[]) {
		// Setting the RMI Security Manager...
		System.setSecurityManager(new SecurityManager());
		
		try {
			System.out.println("Creating a Market place Server!");
			
			// Location of BankServer
            String name = "//tesla.cs.iupui.edu:1118/MarketPlaceServer";
			
			// Create a new instance of a MarketPlaceServer.
            MarketPlaceServer market = new MarketPlaceServer(name);
			
			System.out.println("MarketServer: binding it to name: " + name);
			
			// Binds the MarketPlaceServer to the RMI Service.
			Naming.rebind(name, market);
			
			System.out.println("Market Server Ready!");
            
		} catch (Exception e){
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}


