public class MarketPlaceDispatcher {
    private MarketPlaceClientView clientView;
    private MarketPlaceAdminView adminView;
    
    public MarketPlaceDispatcher(){
        clientView = new MarketPlaceClientView();
        adminView = new MarketPlaceAdminView();
    }
   
    public void dispatch(String request){
        if(request.equalsIgnoreCase("CLIENT"))
        {
            clientView.show();
            int command = clientView.chooseOption();

            ClientMethod clientMethod = new ClientMethod();
            ClientController clientController = new ClientController(clientMethod);
            Invoker invoker = new Invoker();
            invoker.takeOrder(clientController);
            invoker.placeOrders(command);
            
        }else if(request.equalsIgnoreCase("ADMIN"))
        {
            adminView.show();
            int command = adminView.chooseOption();
            
            AdminMethod adminMethod = new AdminMethod();
            AdminController adminController = new AdminController(adminMethod);
            Invoker invoker = new Invoker();
            invoker.takeOrder(adminController);
            invoker.placeOrders(command);
        }
        else{
            System.out.println("NO USER");
        }
        
        
    }
}



