

public class Demo {
    public static void main(String args[]){
        Rectangle obj=new Rectangle();
        obj.Print();

    }
    
}


    
class Rectangle
{
    public double length;
    public double breadth;
    Rectangle(){
        length=10;
        breadth=20;
    }

    public void Print(){
        System.out.println(length+"\n"+breadth);
    }
}
