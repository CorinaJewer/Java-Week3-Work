public class MyCircle {
    
    private MyPoint center;
    private int radius;

    public MyCircle(){   //Default Constructor
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(MyPoint center, int radius){ //Parameterized Constructor
        this.center = center;
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public MyPoint getCenter(){
        return center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    //int x = this.center.getX();: You're retrieving the X coordinate of a center. The this.center refers to an object that has a method called getX().

    //int y = this.center.getY();: Similarly, you're retrieving the Y coordinate of the same center. The this.center has a method called getY().

    //int[] xy = {x, y};: You're creating an integer array xy that contains the X and Y coordinates obtained in the previous steps.

    //return xy;: Finally, you're returning the array xy, which holds the X and Y coordinates of the center.


    public int []getCenterXY(){
        int x = this.center.getX();
        int y = this.center.getY();
        int [] xy = {x, y};
        return xy; 
    }

    public void setCenteXY(int x, int y){
        this.center.setXY(x, y);
    }

    public String toString() {
        return String.format("MyCircle[radius=%d,center=%s]", this.radius, this.center);
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;

    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }
    
}
