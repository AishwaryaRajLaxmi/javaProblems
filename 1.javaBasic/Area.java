import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double s,area;

        System.out.println("Enter 3 side of a Triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();

        s=(a+b+c)/2;

        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is"+area);


    }
}
