package src;

import java.util.HashMap;

public class AcctHM implements IAcctSet {
    HashMap<Integer,Account> accts = new HashMap<>();
    @Override
    public void addAccount(Account a) {
        accts.put(a.getNum(),a);
    }

    @Override
    public Account findAccount(int acctnum) {
        return accts.get(acctnum);
    }
}
