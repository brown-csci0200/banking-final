package banking;
public interface ICustSet {
    public Customer findCustomer(String name) throws CustNotFoundExn;
    public void addCustomer(Customer cust);
}
