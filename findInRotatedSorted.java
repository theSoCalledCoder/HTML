public class findInRotatedSorted {
    public int findPivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        int n=arr.length;
        int mid;
        if(arr[start]<arr[end]) return 0;
        while(start<end){
            mid= start +(end-start)/2;
            if(arr[mid]>arr[(mid+1)%n]){
                return mid +1;
            }
            else if(arr[start]>arr[mid]){
                end=mid;
            }
            else
                start=mid+1;
        }
        return 0;
    }

    public int search(int[] arr, int target) {
        int n=arr.length;
        int mid;
        int start=findPivot(arr);
        System.out.println(start);
        int end=start+n-1;
        System.out.println(end);
        while(start<=end){
            mid= start + (end-start)/2;
            System.out.println("mid "+mid%n);
            if(arr[mid%n]==target){
                return mid%n;
            }
            else if(arr[mid%n]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        findInRotatedSorted obj=new findInRotatedSorted();
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        int result=obj.search(arr,target);
        System.out.println("Element found at index: " + result);
    }
}
