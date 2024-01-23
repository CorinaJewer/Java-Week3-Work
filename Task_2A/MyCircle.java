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
