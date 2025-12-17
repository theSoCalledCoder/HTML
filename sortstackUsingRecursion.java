import java.util.Stack;

public class sortstackUsingRecursion {
    public static void insertInOrder(Stack<Integer> stack, int value){
        if(stack.isEmpty() || stack.peek()<=value){
            stack.add(value);
            return;
        }
        int tempo = stack.pop();
        insertInOrder(stack, value);
        stack.add(tempo);

        
    }
    public static void sortStack(Stack<Integer> stack) {
        if(stack.size() <=1){
            return;
        }
        int temp = stack.pop();
        sortStack(stack);
        System.out.println("Inserting " + temp);
        insertInOrder(stack, temp);
        

    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(0);
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(6);
        sortStack(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
