

public class TestInvoice {
    public static void main(String[] args) {
        Customer cust1 = new Customer(4,"Betty White", 30);
        Invoice inv1 = new Invoice(1,cust1,300.54);

        System.out.println();

        System.out.println(inv1.getID());
        System.out.println(inv1.getCustomer());
        System.out.println(inv1.getAmount());
        System.out.println(inv1.getCustomerName());
        System.out.println (String.format("Invoice Amount after discount is $%.2f.",inv1.getAmountAfterDiscount()));

        System.out.println();
    }
}