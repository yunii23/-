public class java_201230_04 {
    //백준 1차원 배열 최소, 최대
    public static void main(String[] args) {
        int [] arr = {20, 10, 35, 60, 3};
        int max = 0;
        int min = arr[0];

        for (int i = 0; i<arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }else {
                if (min > arr[i]){
                    min = arr[i];
                }
            }
        } 
        System.out.printf("%d %d", max, min);
    }
}
