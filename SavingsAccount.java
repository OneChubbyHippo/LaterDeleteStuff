/**
   A savings account earns interest on the minimum balance.
*/
public class SavingsAccount extends BankAccount
{
   private double interestRate;
   private double minBalance; 

   /**
      Constructs a savings account with a zero balance.
   */
   public SavingsAccount()
   {
      interestRate = 0;
      minBalance = 0;
   }

   /**
      Sets the interest rate for this account.
      @param rate the monthly interest rate in percent
   */
   public void setInterestRate(double rate)
   {
      interestRate = rate;
   }

   @Override
   public void withdraw(double amount)
   {
      //Use super to invoke a void setter method
      super.withdraw(amount);
      //How come the code didn't include "super" in super.getBalance()
      // Notice that you can't directly access the variable
      double balance = super.getBalance();
      if (balance < minBalance)
      {
         minBalance = balance;
      }
   }

   @Override
   public void monthEnd()
   {
      double interest = minBalance * interestRate / 100;
      deposit(interest); //How come the code didn't include the "super." in super.getBalance()
      minBalance = super.getBalance();
   }
}
