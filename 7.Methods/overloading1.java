

public class overloading1{
    public int max(int a,int b){
        return a>b?a:b;
    }

    public int max(int a,int b,int c){
        if(a>b && a>c)
        return a;
        else if(b>c)
        return b;
        return c;

    }
    public static void main(String[] args) {
     overloading1 ob=new overloading1();
int a=ob.max(10,5);
int b=ob.max(10,15,5);
System.out.println(a);
System.out.println(b);


    
    }
}
