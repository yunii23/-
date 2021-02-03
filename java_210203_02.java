import java.util.Scanner;

public class java_210203_02 {
    // 백준 1차원 배열 평균은 넘겠지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 테스트 케이스마다 학생의 수
        int[] arr;
        arr = new int[n];

        // n명의 점수들
        int[] arr2;

        // 평균
        Double[] arr3;
        arr3 = new Double[n];

        int count;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            arr2 = new int[arr[i]];
            arr3[i] = 0.0;
            count = 0;

            for(int j=0; j<arr[i]; j++){
                arr2[j] = sc.nextInt();
                arr3[i] = arr2[j] + arr3[i];

                if(j == arr[i]-1) {

                    arr3[i] = arr3[i]/arr[i]; 

                    for(int k=0; k<arr[i]; k++) {
                        if(arr3[i] < arr2[k]) {
                            count++;
                        }
                    }

                    Double result = 0.0;
                    result = 100.0*count/arr[i];

                    System.out.println(String.format("%.3f", result));
                }
            }
        }

        sc.close();
    }
}
