public class UsernameFactory extends MarketAbstractFactory
{
    
   // @Override
    public MarketUsernameInterface getUsername(String usernameType){
        
        if(usernameType == null){
            return null;
        }
        
        if(usernameType.equalsIgnoreCase("USERNAME")){
            return new UserUsernameMethod();
            
        }else if(usernameType.equalsIgnoreCase("EMAIL")){
            
            return new UserEmailMethod();
            
        }else if(usernameType.equalsIgnoreCase("NUMBER")){
         
            return new UserNumberMethod();
            
        }
        return null;
    }
    
    public MarketPasswordInterface getPassword(String password)
    {
        return null;
    }
}
