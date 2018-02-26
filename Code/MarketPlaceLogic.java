import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class MarketPlaceLogic
{
    
    public boolean checkUser(int type, String user,String password)
    {
        if(type == 1)
        {
            if((user.equalsIgnoreCase("PRITESH") || user.equalsIgnoreCase("pratnapp@iupui.edu")|| user.equalsIgnoreCase("9762672674")) && password.equalsIgnoreCase("MARKET"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }else if(type == 2)
        {
            if(user.equalsIgnoreCase("PRITESH") && password.equalsIgnoreCase("HI"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else{
            return false;
        }
        
    }
    

}
