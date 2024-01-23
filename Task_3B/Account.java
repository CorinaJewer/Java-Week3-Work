public class Account {
    
    private int ID;
    private Customer3B customer3B;
    private double balance = 0.0;

    public Account (int ID, Customer3B customer3B, double balance){
        this.ID = ID;
        this.customer3B = customer3B;
        this.balance = balance;
    }

    public Account (int ID, Customer3B customer3B){
        this.ID = ID;
        this.customer3B = customer3B;
    }

    public int getID(){
        return ID;
    }

    public Customer3B getCustomer3B(){
        return customer3B;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String toString(){
        return (this.customer3B.getName() + " (" + this.ID + ")" + "balance = $ " + String.format("%.2f", this.balance));
    }

    public String getCustomerName(){
        return customer3B.getName();
    }

    public Account deposit(double amount){
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if(balance >= amount){
        this.balance -= amount;
        }else{
            System.out.println("Transaction denied as the withdrawal amount exceeds the current balance");
        }
        return this;
    }
}
