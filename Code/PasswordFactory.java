public class PasswordFactory extends MarketAbstractFactory
{
    
    public MarketUsernameInterface getUsername(String usernameType){
        return null;
    }
    
    
    // @Override
    public MarketPasswordInterface getPassword(String passwordType){
        
        if(passwordType == null){
            return null;
        }
        
        if(passwordType.equalsIgnoreCase("PASSWORD")){
            return new UserPasswordMethod();
            
        }
        return null;
    }
    
}

