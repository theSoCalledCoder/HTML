import java.util.ArrayList;


public class sortarrayusingRecursion {
    public static void insertInOrder(ArrayList<Integer> arr, int last, int n){
        
        if(arr.isEmpty() || arr.getLast()<=last ){
            arr.add(last);
            return;
        }
        int temp = arr.getLast();
        arr.removeLast();
        insertInOrder(arr, last, n-1);
        arr.add(temp);
    }
    public static void sortArray(ArrayList<Integer> arr,int n){
        if(n<=1){
            return;
        }
        int last = arr.getLast();
        arr.removeLast();
        sortArray(arr, n-1);
        insertInOrder(arr, last, n);

    }    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(0);
        arr.add(5);
        arr.add(7);
        arr.add(2);
        arr.add(6);
        sortArray(arr, arr.size());
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
