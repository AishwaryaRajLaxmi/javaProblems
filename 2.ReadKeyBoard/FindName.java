import java.util.Scanner;

public class FindName {
    public static void main(String args[]){
        String name;

        Scanner sc=new Scanner(System.in);
        System.out.println("May I know your name:");
        name=sc.next();
        sc.close();
        System.out.println("My name is :"+name);
    }
}
