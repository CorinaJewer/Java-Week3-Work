public class TestCustomer3B {
    public static void main(String[] args) {
        Customer3B c1 = new Customer3B(1,"Kermit The Frog", 'm');
        Customer3B c2 = new Customer3B(2,"Miss Piggy", 'f');

        System.out.println();

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getID());
        System.out.println(c2.getName());
        System.out.println(c1.getGender());

        System.out.println();
    }   
}
