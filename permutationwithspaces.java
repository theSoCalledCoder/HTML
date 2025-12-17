// public class permutationwithspaces {
//     public static void permutationWithSpace(String str,String input,String output) {
//         if (str.length() <=1) {
//             System.out.println(output);
//             return;  
//         }
//         input= input+str.charAt(0);
//         String remaininginput=str.substring(1);
//         String op1=input+ remaininginput;
        
//         str=str.substring(1);
//         permutationWithSpace(str, input, op1);
//         input=input+"_";
//         String op2= input + remaininginput;
//         permutationWithSpace(str, input, op2);
//     }
//     public static void main(String[] args) {

//         String str = "ABCD";
//         String input="";
//         String output="";
//         permutationWithSpace(str,input,output);
        
//     }
// }

public class permutationwithspaces {
    public static void permutationWithSpace(String str,String input,String output) {
        if (input.length() <=0) {
            System.out.println(output);
            return;  
        }
        String op1=output+input.charAt(0);
        String op2= output+  "_" + input.charAt(0);
        input=input.substring(1);
        permutationWithSpace(str, input, op1);
        permutationWithSpace(str, input, op2);
    }
    public static void main(String[] args) {

        String str = "ABC";
        String input="BC";
        String output="A";
        permutationWithSpace(str,input,output);
        
    }
}
