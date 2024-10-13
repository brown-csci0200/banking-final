package banking;

public class Main {
    public static void main(String[] args) {
        // Here is the model-view-controller configuration
        // Model (here's where you choose which data structs to use)
        AccountList allAccounts = new AccountList();
        CustomerList allCusts = new CustomerList();

        // Controller (model classes passed in as constructor inputs)
        BankingService B = new BankingService(allAccounts,allCusts);

        // View (Controller is passed in as a constructor input)
        BankingConsole C = new BankingConsole(B);

        // Set up any initial data -- this could be done either through the
        //    controller or directly in the model, depending on whether the
        //    controller has more to do than just defer to the model
        Customer kCust = new Customer("kathi", "cs200");
        Account kAcct = new Account(100465, kCust, 150);
        B.addCustomer(kCust);
        B.addAccount(kAcct);

        // Then start the program
        C.loginScreen();
        C.showBalance(100465);
    }
}
