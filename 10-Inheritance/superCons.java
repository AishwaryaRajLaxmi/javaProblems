
    class Parent
    {
        Parent()
        {
            System.out.println("Non-Param of parent");
        }
        Parent(int x)
        {
            System.out.println("Param of parent "+x);
        }
    }
    
    class Child extends Parent
    {
        Child()
        {
            System.out.println("Non-Param of child");
        }
        Child(int y)
        {
            System.out.println("Param of child");
        }
        Child(int x,int y)
       {//the super(x) will call parent class of constructor with param
            super(x);
            System.out.println("2 param of child "+y);
        }
    }
    
    public class superCons { 
        public static void main(String args[]){
            Child c=new Child(10,20);
        }
    }
    
