public class printstringsubsets {
    public static void printSubsets(String input, String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String op1= output;
        String op2= output + input.charAt(0);
        input = input.substring(1);
        printSubsets(input, op1);
        printSubsets(input, op2);
        

    }
    public static void main(String[] args) {
        String str="abcd";
        int n = str.length();
        String output="";
        String input=str;
        printSubsets(input, output);
    }
}
