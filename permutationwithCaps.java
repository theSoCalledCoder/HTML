public class permutationwithCaps {
    public static void permutationWithCaps(String str,  String output) {
        if(str.length()<= 0){
            System.out.println(output);
            return;
        }
        String op1=output+ str.charAt(0);
        String op2= output + Character.toUpperCase(str.charAt(0));
        str=str.substring(1);
        permutationWithCaps(str,  op1);
        permutationWithCaps(str, op2);

    }
    public static void main(String[] args) {
        String str = "abc";
        String output = "";
        permutationWithCaps(str, output);
    }
}
