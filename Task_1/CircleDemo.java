public class CircleDemo {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        Circle C2 = new Circle(5);
        Circle C3 = new Circle(5,"red");

        //Circle.PI = 5.6;

        System.out.println();
        System.out.println(C1.getArea());
        System.out.println(C2.getArea());
        System.out.println(C3.getArea());
        System.out.println();


    }
}
