package src;

public class BankingService {
    IAcctSet accounts;
    ICustSet customers;

    public BankingService(IAcctSet al, ICustSet cl) {
        this.accounts = al;
        this.customers = cl;
    }

    public void addAccount(Account a) {
        this.accounts.addAccount(a);
    }

    public void addCustomer(Customer kCust) {
        this.customers.addCustomer(kCust);
    }

    public Double getBalance(int forAcctNum) throws AcctNotFoundExn {
        return accounts.findAccount(forAcctNum).getBalance();
    }

    public Double withdraw(int forAcctNum, double amt) throws AcctNotFoundExn {
        return accounts.findAccount(forAcctNum).withdraw(amt);
    }

    public void login(String custname, String withPwd) throws CustNotFoundExn, LoginFailedException {
        Customer cust = customers.findCustomer(custname);
        if (!(cust.checkPwd(withPwd))) {
            throw new LoginFailedException();
        }
    }

}
