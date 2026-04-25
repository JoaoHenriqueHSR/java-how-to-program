public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("Henrique", 10);

        displayAccount(myAccount);
        myAccount.deposit(20);

        displayAccount(myAccount);

        myAccount.withdraw(4);

        displayAccount(myAccount);

    }

    public static void displayAccount(Account accountToDisplay)
    {
        System.out.println(accountToDisplay.getName() +" "+ accountToDisplay.getBalance());
    }
}