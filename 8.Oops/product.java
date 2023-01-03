
 class product2 {

    private String itemNo;
    private int num;
    // private String name;
    // private double price;
    // private short qty;
    
    public product2(String itemNo)
    {
        this.itemNo=itemNo;
        
        
    }

    public product2(String itemNo,int num)
    {
        this.itemNo=itemNo;
        this.num=num;
        
        
    }

    public void getData(){
        System.out.println("Item no:"+itemNo);
        System.out.println("Item no:"+itemNo+"\n"+"Name:"+num);
    }
}

public class product
{
    public static void main(String[] args) 
    {
        product2 obj1=new product2("13",67);
        obj1.getData();
        // product obj2=new product();
        // product obj3=new product();
        // product obj4=new product();
        
    }   
}
    

