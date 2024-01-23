public class Circle{
    //Attributes
    private double radius;
    private String color;
    static int count =0;
    static final double PI = 3.14;
  
    //Methods
    //no argument or default constructor
   public Circle()
    {
        radius = 2.0;
        color = "";
        count++;
    }
    //parameterized constructor
    public Circle(double r)
    {
        this.radius = r;
        count++;
    }
    public Circle(double r, String s)
    {
        this.radius = r;
        this.color = s;
        count++;
    }

    public double getRadius()
    {
        return radius;
    }
    public String getColor()
    {
        return color;
    }

    public void setRadius(double r){        
        this.radius = r;
    }
    public void setColor(String s)
    {
        this.color = s;
    }
    public static void displayPI()
    {
        System.out.println(PI);
    }
    public static int displayPI(Double PI)
    {
        System.out.println(PI);
        return 1;
    }

    public double getArea()
    {   displayPI();  
        return(PI*this.radius*this.radius);
     
    } 

    public String toString()
    {
        return (this.radius + " "+this.color +"  "+ count + " circles");
    }

}