public class FactoryProducer {
    public static MarketAbstractFactory getFactory(String choice){
        
        if(choice.equalsIgnoreCase("USERNAME")){
            return new UsernameFactory();
            
        }else if(choice.equalsIgnoreCase("PASSWORD")){
            return new PasswordFactory();
        }
        
        return null;
    }
}
