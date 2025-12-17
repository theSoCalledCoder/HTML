import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class nearestGreater {
    public static List<Integer> nearGreater(int [] arr, int n){
        Stack<Integer> s = new Stack<>();
        List<Integer> res = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            while(!s.empty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.empty()){
                res.add(-1);
            }
            else if(!s.empty() && s.peek()>arr[i]){
                res.add(s.peek());
            }
            s.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {100,80,60,70,60,75,85};
        int n = arr.length;
        List <Integer> ls= nearGreater(arr, n);
        Collections.reverse(ls);
        for(int k : ls){
            System.out.print(k + " ");
        }
    }
}


