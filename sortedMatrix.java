public class sortedMatrix {
    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
        
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 8, 10},
            {11, 12, 14, 16},
            {17, 18, 19, 20}
        };

        int target = 8;
        int[] result = searchInSortedMatrix(matrix, target);

        if (result[0] != -1) {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }
}
