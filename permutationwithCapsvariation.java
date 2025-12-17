public class permutationwithCapsvariation {
    public static void permutationWithCaps(String str,  String output) {
        if(str.length()<= 0){
            System.out.println(output);
            return;
        }
        char ch=str.charAt(0);
        if(Character.isDigit(ch)==true)
        {
            String op1=output+ch;
            str=str.substring(1);
            permutationWithCaps(str,  op1);
            
            return;
        }
            String op1=output+ str.charAt(0);
            String op2= output + Character.toUpperCase(str.charAt(0));
        

        
        
        str=str.substring(1);
        permutationWithCaps(str,  op1);
        permutationWithCaps(str, op2);

    }
    public static void main(String[] args) {
        String str = "a1b2";
        String output = "";
        permutationWithCaps(str, output);
    }
}

