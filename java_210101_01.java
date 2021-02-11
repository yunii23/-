public class java_210101_01 {
    //백준 1차원 배열 숫자의 개수
    public static void main(String[] args) {
        int val = 150*266*427;
        int[] arr = new int[10];
            
            while(val!=0) {
                arr[val%10]++;
                val/=10;
            }
            
            for(int result : arr) {
                System.out.println(result);
            }
    }
}
