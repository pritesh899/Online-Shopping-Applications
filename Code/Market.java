// Honor Pledge:
//// I pledge that I have neither given nor
// received any help on this assignment.
//
// -pratnapp
public interface Market extends java.rmi.Remote {
	/**
	 * Gets the username.
	 * 
	 * @return Username
	 * @throws java.rmi.RemoteException
	 */
	//String get_username(String user) throws java.rmi.RemoteException;
    public boolean verify_user(int type, String user, String Password) throws java.rmi.RemoteException;
}
