package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("PNC");
        bank.addNewBranch("St. Louis");
        bank.addNewBranch("Chicago");
        bank.addNewBranch("Branson");
        bank.addNewBranch("New York");
        bank.displayBranches();

        bank.addCustomerToBank("Chicago", "Chase");
        bank.addCustomerWithTransactionToBank("Chicago", "Tom", 100.00);
        bank.addCustomerToBank("Branson", "Joe");
        bank.addCustomerWithTransactionToBank("Chicago", "Sara", 200.00);
        bank.addCustomerToBank("Branson", "Jim");
        bank.addCustomerToBank("St. Louis", "Kathy");
        bank.addCustomerToBank("New York", "Ben");

        bank.addCustomerTransaction("St. Louis", "Chase", 10000.00);
        bank.addCustomerTransaction("Chicago", "Chase", 40.00);
        bank.addCustomerTransaction("Chicago", "Tom", 120.00);

        bank.displayBranchCustomers("St. Louis");
        bank.displayBranchCustomers("Chicago");
    }
}
