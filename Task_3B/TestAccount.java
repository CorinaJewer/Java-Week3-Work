public class TestAccount {
    public static void main(String[] args) {
        Customer3B c3 = new Customer3B(1,"John Lennon", 'm');
        Account acct1 = new Account(1, c3,1000.00);

        System.out.println();

        System.out.println(acct1);
        
        System.out.println(acct1.getID());
        System.out.println(acct1.getCustomer3B());
        System.out.println (String.format("%.2f", acct1.getBalance()));
        System.out.println(acct1.getCustomerName());
        acct1.deposit(504.30);
        System.out.println (String.format("$%.2f", acct1.getBalance()));
        acct1.withdraw(140.00);
        System.out.println (String.format("$%.2f", acct1.getBalance()));

        System.out.println();
    }
}
