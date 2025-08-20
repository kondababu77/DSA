import java.util.*;

public class Subarray2{
    public static int maxSubarray(int arr[]){
        int current = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            current += arr[i];
            if(current < 0){
                current = 0;
            }
            max = Math.max(current,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-5,6,7,9};
        System.out.println(maxSubarray(arr));
    }    
}