
import java.util.Scanner;

public class java_210203_01 {
    //백준 1차원 배열 ox퀴즈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr;
        arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();

            int count = 0;
            int sum = 0;

            for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O') {
                    count++;
                    sum += count;
                }else{
                    count = 0;
                }

            }
            System.out.println(sum);
        }

        sc.close();



    }
}
