import java.util.HashMap;
import java.util.Scanner;

public class java_210202_02 {
    // 백준 1차원 배열 나머지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0,0,0,0,0,0,0,0,0,0};

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<10; i++) {
            arr[i] = arr[i] % 42;
            map.put(arr[i], arr[i]);
        }

        System.out.println(map.size());
    }
}
