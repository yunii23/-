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
        
        for(int i=0; i<10; i++) {
            arr[i] = arr[i] % 42;
            System.out.println(arr[i]);
        }
        
        int count = 0;

        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                
            }
        }

        
        System.out.println(count);
    }
}
