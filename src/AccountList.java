package src;

import java.util.LinkedList;

public class AccountList implements IAcctSet {
    LinkedList<Account> accts;

    public AccountList() {
        this.accts = new LinkedList<Account>();
    }

    @Override
    public void addAccount(Account a) {
        accts.addFirst(a);
    }

    @Override
    public Account findAccount(int acctnum)
            throws AcctNotFoundExn{
        for (Account acct:accts) {
            if (acct.numMatches(acctnum)) {
                return acct;
            }
        }
        throw new AcctNotFoundExn(acctnum);
    }
}
