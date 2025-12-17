import java.util.Stack;

public class removemiddleFromStack {

    public static void removeMiddle(Stack<Integer> stack, int n,int middle){
        if(n==middle){
            stack.pop();
            return;
        }
        int temp = stack.pop();
        removeMiddle(stack, n-1, middle);
        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int n = stack.size();
        int middle;
        middle= n/2 +1;
        removeMiddle(stack, n, middle);

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
