package banking;
public class CustNotFoundExn extends Exception {
    String custName;
    public CustNotFoundExn(String custName) {
        this.custName = custName;
    }
}
