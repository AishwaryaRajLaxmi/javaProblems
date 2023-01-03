

class MyClass
{
    protected double length;
    protected double breadth;
    
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
}
public class rectangle {
    public static void main(String args[]){
        MyClass r=new MyClass();
        r.length=10;
        r.breadth=5;
        System.out.println("Area"+r.area());
        System.out.println("perimeter"+r.perimeter());
        
        System.out.println("Is it a Square"+r.isSquare());

    }
}
