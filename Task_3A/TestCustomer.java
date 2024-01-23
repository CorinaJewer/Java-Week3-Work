public class TestCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer (1,"Heather",20);
        Customer customer2 = new Customer (2,"Robin",5);
        Customer customer3 = new Customer (3,"Jennifer",10);

        System.out.println();

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        System.out.println(customer1.getID());
        System.out.println(customer2.getName());
        System.out.println(customer3.getDiscount());

        customer3.setDiscount(25);

        System.out.println(customer3.getDiscount());

        System.out.println();       
    }
}
