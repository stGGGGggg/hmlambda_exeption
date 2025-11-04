interface StringChekcer{
    boolean Empty(String str);
}

public class lambda2 {
    public static void main(String[] args) {
        StringChekcer stringChekcer = str -> str.length()==0;
        String str1="";
        String str2="java";

        System.out.println("str1: "+stringChekcer.Empty(str1));
        System.out.println("str2; "+stringChekcer.Empty(str2));



    }
}
