
import java.util.*;
public class insertAtPosition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int Arr[]=new int[5];

        for(int i=0;i<5;i++){
            Arr[i]=sc.nextInt();
        }

        System.out.println("Enter number to be inserted and index\n");
        int num=sc.nextInt();
        int index=sc.nextInt();

        for(int i=5;i>index;i--){
            Arr[i]=Arr[i-1];
            Arr[index]=num;

        }

        System.out.println("New Array\n");
        for(int i=0;i<=5;i++){
            System.out.print(Arr[i]+" ");
        }

    }
}
