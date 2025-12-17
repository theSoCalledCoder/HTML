import java.util.ArrayList;
import java.util.Stack;

public class maxAreaBinaryMatrix {
    public static void SmallerToLeft(ArrayList<Integer> a, int [] arr){
        Stack<Integer> s=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                a.add(i);
            }
            else{
                a.add(i-s.peek()-1);
            }
            s.push(i);
        }
        return;
    }
    public static void SmallerToRight(int[] a,int [] arr){
        Stack<Integer> s=new Stack<>();
        int n=arr.length;
        int j=0;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                a[i]=n-1-i;
            }
            else{
                a[i]=s.peek()-i-1;
            }
            s.push(i);
        }
        return;
    }
    public static int largestRectangleArea(int[] arr){
        int ans;
        int maxi=0,n=arr.length;
        ArrayList<Integer> a=new ArrayList<>();
        
        
        int [] b= new int[n];
        SmallerToLeft(a,arr);
        SmallerToRight(b,arr);
        for(int i=0;i<n;i++){
            ans=arr[i]*(a.get(i)+b[i]+1);
            maxi=Math.max(ans,maxi);
        }
        return maxi;
    }
    public static int maximalRectangle(int[][] matrix) {
        int n=matrix.length;
        int maxArea = 0;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i>0 && matrix[i][j]==1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            int area = largestRectangleArea(matrix[i]);
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 0, 1},
            {1, 0, 1, 1, 0},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 0}
        };
        
        int maxArea = maximalRectangle(matrix);
        System.out.println("Maximum area of rectangle in binary matrix: " + maxArea);
    }
}
