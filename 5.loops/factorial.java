
import java.util.Scanner;
public class factorial {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int i=1;

        System.out.println("Enter a number:");
        int x=sc.nextInt();
        
        while(i<=x){
            fact=fact*i;
            i++;
        }

        System.out.println(fact);

        
}
}
