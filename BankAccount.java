lic class BankAccount {
 private String accountHolder;
 private double balance;
 public BankAccount(String accountHolder, double balance) {
 this.accountHolder = accountHolder;
 this.balance = balance;
 }
 public void deposit(double amount) {
 // TODO: add the amount to the balance
 }
 private static final double TRANSACTION_FEE = 2.0;
 public boolean withdraw(double amount) {
 // Every successful withdrawal charges a $2 transaction fee, and at least $50 must remain in the account after the amount and fee are deducted.
 double total = amount + TRANSACTION_FEE;
 if (amount > 0 && balance - total >= 50) {
 balance -= total;
 return true;
 }
 return false;
 }
 public String getAccountSummary() {
 return accountHolder + ": $" + balance;
 }
}
