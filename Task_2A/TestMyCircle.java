public class TestMyCircle {
    public static void main(String[] args) {

        System.out.println();

        MyCircle mc1 = new MyCircle();
        MyCircle mc2 = new MyCircle(new MyPoint(3,6), 2);

        System.out.println(mc1);
        System.out.println(mc2);

        System.out.println(String.format("%.2f",mc1.getArea()));
        System.out.println(String.format("%.2f", mc2.getCircumference()));

        System.out.println(String.format("Distance between mc1 and mc2 is %.2f units.",mc1.distance(mc2)));

        mc1.setCenterX(5);
        mc1.setCenterY(8);
        System.out.println(mc1.getCenter());
    

        System.out.println(String.format("Distance between mc1 and mc2 is %.2f units.",mc1.distance(mc2)));

    }
}
