

public class Cylinder {
    private int radius;
    private int height;

    public Cylinder(){
        radius=height=1;
    }

    public Cylinder(int r,int h)
    {
        radius=r;
        height=h;
    }

   

    public void setHeight(int h){
        if(h>=0)
        height=h;
        else
        height=0;
    }

    public void setRadius(int r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }

    public void GetArea(){
        System.out.println("radius:"+radius+"\n"+"height:"+height);
    }

    public static void main(String args[]){
        Cylinder obj=new Cylinder();
        Cylinder obj2=new Cylinder(10,20);
        obj2.GetArea();
        obj.setHeight(10);
        obj.setRadius(5);
        obj.GetArea();
    
        
    }
}
