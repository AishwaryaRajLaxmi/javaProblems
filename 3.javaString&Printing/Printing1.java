

public class Printing1 {
    public static void main(String[] args) {
        int x=10;
        float y=12.56f;
        char z='A';
        String str="TanuProgram";

        System.out.printf("%3$s %2$f %1$d",x,y,str);

        System.out.printf("Hello \n%d \n%f \n%c \n%s\n",x,y,z,str);
        //%o,%x,%e for float value

        //here after %10 means 10 space
        String str2="Java";
        System.out.printf("%10s",str2);

        int p=10;
        System.out.printf("\n%10d",p);

    
}
}