public class parenthesis {
    public static void generateParenthesis(String output, int open, int close) {
        if(open == 0 && close ==0){
            System.out.println(output);
            return;
        }
        if(open > 0){
            generateParenthesis(output+"(", open-1, close);
        }
        if(close > open){
            generateParenthesis(output+")", open, close-1);
        }
        
    }

    public static void main(String[] args) {
        int n=3;
        generateParenthesis("", n, n);
    }
}
