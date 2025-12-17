import java.util.Stack;
public class nearestGreaterToLeft {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int [] res = new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        for(int k: res){
            System.out.print(k + " ");
        }
        
    }
}


