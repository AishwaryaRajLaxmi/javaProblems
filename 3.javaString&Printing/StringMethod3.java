public class StringMethod3 {
    
    public static void main(String[] args) {
        
        
        String str1="Pyramid";
        String str2="Pyramid";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str2);

        String str="the great wall ";
        String st="of china";
        System.out.println(str.contains("wall"));
        System.out.println(str.concat(st));
}
}