package banking;
public class AcctNotFoundExn extends Exception {
    int acctNum;

    public AcctNotFoundExn(int acctNum) {
        this.acctNum = acctNum;
    }
}
