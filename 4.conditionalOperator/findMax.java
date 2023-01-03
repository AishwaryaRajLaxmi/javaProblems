//Find the maximum number in three
import java.util.Scanner;


public class findMax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();

        if(a>b && a>c){
            System.out.println(a+" is big");
        }
        else if(b>c){
            System.out.println(b+" is big");
        }
        else{
            System.out.println(c+" is big");
        }


    }
    
}
