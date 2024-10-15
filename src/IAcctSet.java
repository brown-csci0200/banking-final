package src;
public interface IAcctSet {
    public void addAccount(Account a);
    public Account findAccount(int acctnum) throws AcctNotFoundExn;
}
