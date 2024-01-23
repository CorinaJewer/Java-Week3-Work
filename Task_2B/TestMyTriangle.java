public class TestMyTriangle {
    public static void main(String[] args) {

        System.out.println();

        MyPoint v1 = new MyPoint(3,4);
        MyPoint v2 = new MyPoint(1,4);
        MyPoint v3 = new MyPoint(1,4);


        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        
        
        MyTriangle t1 = new MyTriangle(0,4,3,5,3,6);
        System.out.println(t1);
        MyTriangle t2 = new MyTriangle(v1, v2, v3);
        System.out.println(t2);

        System.out.println (String.format("Permiter: %.2f", t1.getPerimeter()));
        System.out.println (String.format("Permiter: %.2f", t2.getPerimeter()));
        System.out.println(t1.printType());
        System.out.println(t2.printType());

        System.out.println();
       
    }
}
