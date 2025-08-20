import java.util.*;

public class Subarray1{
    public static int maxSubarray(int arr[]){
        int current = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                current = 0;
                for(int k=i; k<=j; k++){
                    current += arr[k];
                }
                System.out.println(current);
                max = Math.max(max, current);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-5,6,7,9};
        System.out.println(maxSubarray(arr));
    }    
}