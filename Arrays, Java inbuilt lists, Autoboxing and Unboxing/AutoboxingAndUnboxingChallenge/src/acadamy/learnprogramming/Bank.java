package acadamy.learnprogramming;

import java.util.ArrayList;
import java.util.spi.AbstractResourceBundleProvider;

public class Bank {
    private String bankName;
    private ArrayList<Branch> bankBranches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranches = new ArrayList<Branch>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBankBranches() {
        return bankBranches;
    }

    //Add a new branch
    public void addNewBranch(String branchName){
        if(findBranch(branchName) < 0) {
            Branch newBranch = new Branch(branchName);
            this.bankBranches.add(newBranch);
            System.out.println("Successfully added new Branch: " + branchName);
        } else{
            System.out.println("Failed to add new branch " + branchName + " because it already exists.");
        }
    }

    //Determine if the new branch already exists
    public int findBranch(String branchName){
        for(int i = 0; i < bankBranches.size(); i++){
            if(branchName.equals(bankBranches.get(i).getBranchName())){
                return bankBranches.indexOf(bankBranches.get(i));
            }
        }
        return -1;
    }

    //Display the branches
    public void displayBranches(){
        if(bankBranches.size() == 0){
            System.out.println("There are no branches at this bank.");
        } else{
            System.out.println("Branch List: ");
            for(int i = 0; i < bankBranches.size(); i++){
                System.out.println("Branch #" + (i+1) + ": " + bankBranches.get(i).getBranchName());
            }
        }
    }

    //Add a customer without a transaction
    public void addCustomerToBank(String branchName, String customerName){
        int branchIndex = findBranch(branchName);
        if(branchIndex >= 0){
            bankBranches.get(branchIndex).addNewCustomer(customerName);
        } else{
            System.out.println("Failed to add because branch " + branchName + " doesn't exist");
        }
    }

    //Add a customer with a initial transaction
    public void addCustomerWithTransactionToBank(String branchName, String customerName, double transaction){
        int branchIndex = findBranch(branchName);
        if(branchIndex >= 0){
            bankBranches.get(branchIndex).addNewCustomerWithTransaction(customerName, transaction);
        } else{
            System.out.println("Failed to add because branch " + branchName + " doesn't exist");
        }
    }

    //Display a branches customers
    public void displayBranchCustomers(String branchName){
        int branchIndex = findBranch(branchName);
        if(branchIndex >= 0){
            System.out.println("Customers at branch " + branchName);
            bankBranches.get(branchIndex).displayBranchCustomersWithTransactions();
        } else{
            System.out.println("Failed to display branch customers because branch " + branchName + " doesn't exist");
        }
    }

    //Add a transaction
    public void addCustomerTransaction(String branchName, String customerName, double transaction){
        int branchIndex = findBranch(branchName);
        if(branchIndex >= 0){
            System.out.println("Successfully add transaction of amount $" + transaction + " to customer " + customerName + " at branch " + branchName);
            bankBranches.get(branchIndex).addCustomerTransaction(customerName, transaction);
        } else{
            System.out.println("Failed to add transaction because branch " + branchName + " doesn't exist");
        }
    }
}
