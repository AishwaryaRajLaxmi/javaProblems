

public class StringObject {
    public static void main(String[] args) {
        
        
        String str1="Java Program";
        System.out.println(str1);

        String str2=new String("java");
        System.out.println(str2);

        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        System.out.println(str3);

        String str4=new String(c,1,3);
        System.out.println(str4);

        byte b[]={65,66,67,68};
        String str5=new String(b);
        str5=new String(b,1,2);
        System.out.println(str5);

        String st="Java";
        //String str2="Java";
        String s=new String("Java");
        System.out.println(st==s);
}

    }