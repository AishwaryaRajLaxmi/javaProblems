import java.util.*;

public class array2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
    int A[]=new int[5];

    int max1,max2;

    // max1=max2;

    max1=max2=A[0];

    for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
    }


    for(int i=0;i<A.length;i++){
        if(A[i]>max1){
            max2=max1;
            max1=A[i];
            
        }
    else if(A[i]>max2){
        max2=A[i];
    }
    }

    System.out.println("Seocond largest is "+max2);
    
}
}
