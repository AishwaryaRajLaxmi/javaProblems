

public class Demo {
    public static void main(String[] args){
    Cylinder c=new Cylinder();
    c.radius=7;
    c.height=10;

    System.out.println("Volume "+c.volume());
    System.out.println("Area "+c.area());
    

}
}



class Circle
{
    public double radius;
    // private int x=10;
    
    protected double area()
    {
        return   radius *radius;
    }

    public double perimeter(){
        return 2*radius;
    }

    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends Circle{
    protected double height;
   
        

    public double volume(){
        return area()*height;
    }
}