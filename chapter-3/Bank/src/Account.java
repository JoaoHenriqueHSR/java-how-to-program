public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name=name;

        if(balance > 0){
            this.balance=balance;
        }
    }

    public void setName( String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void deposit(double depositAmount){
        if(depositAmount> 0){
            this.balance += depositAmount;
        }
    }

    public String withdraw(double value){
        if(value<this.balance){
            return String.valueOf(balance-=value);
        }else{
            return "Withdrawal amount exceeded account balance";
        }
    }

    public double getBalance(){
        return balance;
    }


}
