package acadamy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public void displayBranchCustomers(){
        for(int i = 0; i < this.branchCustomers.size(); i++){
            System.out.println("Customer Name #" + (i + 1) + " " + this.branchCustomers.get(i).getCustomerName());
        }
    }

    public void displayBranchCustomersWithTransactions(){
        for(int i = 0; i < this.branchCustomers.size(); i++){
            System.out.println("Customer Name #" + (i + 1) + " " + this.branchCustomers.get(i).getCustomerName());
            branchCustomers.get(i).displayTransactions();
        }
    }

    //Add new customer without initial transaction
    public void addNewCustomer(String customerName){
        if(findCustomer(customerName) < 0) {
            Customer newCustomer = new Customer(customerName);
            this.branchCustomers.add(newCustomer);
            System.out.println("Successfully added " + customerName);
        } else{
            System.out.println("Failed to add " + customerName + " because they already exist.");
        }
    }

    //Add a new customer with an initial transaction
    public void addNewCustomerWithTransaction(String customerName, double transaction){
        if(findCustomer(customerName) < 0) {
            Customer newCustomer = new Customer(customerName, transaction);
            this.branchCustomers.add(newCustomer);
            System.out.println("Successfully add " + newCustomer + " with an initial transaction of $" + transaction);
        } else{
            System.out.println("Failed to add " + customerName + " because they already exist.");
        }
    }

    //Need to check if the customer already exists
    public int findCustomer(String customerName){
        for(int i = 0; i < branchCustomers.size(); i++){
            if(customerName.equals(branchCustomers.get(i).getCustomerName())){
                return branchCustomers.indexOf(branchCustomers.get(i));
            }
        }
        return -1;
    }

    //Add a customer transaction
    public void addCustomerTransaction(String existingCustomerName, double transactionAmount){
        int customerIndex = findCustomer(existingCustomerName);
        if(customerIndex >= 0){
            this.branchCustomers.get(customerIndex).addTransaction(transactionAmount);
            System.out.println("Successfully added transaction amount of $" + transactionAmount + " to customer " + this.branchCustomers.get(customerIndex).getCustomerName());
        } else{
            System.out.println("Customer " + existingCustomerName + " does not exist.");
        }
    }
}
