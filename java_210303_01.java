import java.util.Arrays;

public class java_210303_01 {
    // 기본적인 회전 알고리즘

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;

        copy(arr, 2, n);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] copy(int arr[], int d, int n) {
        
        for(int i=0; i<d; i++){
            value(arr, n);
        }

        return arr;
    }

    public static int[] value(int arr[], int n){
        int temp = arr[0];
        int i;
        for(i=0; i<n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[i] = temp;

        return arr;
    }
    


}
