package banking;

import java.util.LinkedList;

public class Customer {
    private String name;
    private String password;
    private LinkedList<Account> accounts = new LinkedList<Account>();

    public Customer(String nm, String pwd){
        this.name = nm;
        this.password = pwd;
    }

    public boolean nameMatches(String custName) {
        return this.name.equals(custName);
    }

    public boolean checkPwd(String withPwd) {
        return this.password.equals(withPwd);
    }

    public void addAccount(Account newAcct) {
        this.accounts.addFirst(newAcct);
    }
}
