package src;

import java.util.LinkedList;

public class CustomerList implements ICustSet {
    LinkedList<Customer> customers;

    public CustomerList() {
        this.customers = new LinkedList<Customer>();
    }

    public void addCustomer(Customer cust) {
        this.customers.add(cust);
    }

    @Override
    public Customer findCustomer(String custname) throws CustNotFoundExn {
        for (Customer cust:customers) {
            if (cust.nameMatches(custname));
                return cust;
        }
        throw new CustNotFoundExn(custname);
    }
}
