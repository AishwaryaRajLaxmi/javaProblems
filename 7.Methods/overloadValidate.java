import java.util.*;;

public class overloadValidate {
    boolean validate(String name){
        return name.matches("[Za-zA-]+");
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.next();
sc.close();
overloadValidate o=new overloadValidate();
boolean ans=o.validate(str);
System.out.print(ans);
    }
    
}
