

public class FindGcd {
    int gcd(int m,int n){
        while(m!=n){
            if(m>n)
            m=m-n;
            else
            n=n-m;
        }
        return m;
    }
    public static void main(String args[]){
        FindGcd obj=new FindGcd();
        System.out.print(obj.gcd(25,20));
    }
    
}
