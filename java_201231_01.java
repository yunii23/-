public class java_201231_01 {
    //백준 1차원 배열 최댓값
    public static void main(String[] args) {
        int[] arr = {3,29,38,12,57,74,40,85,61};
        int max = 0;
        int index = 0;

        for(int i = 0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
