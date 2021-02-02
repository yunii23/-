import java.util.Scanner;

public class java_210202_03 {
    //백준 1차원 배열 평균
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Double[] arr;
        arr = new Double[n];
        
        Double max = 0.0;
        Double sum = 0.0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextDouble();
        }

        sc.close();
        
        for (int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i]/max*100;
        }        

        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }

        Double result = sum / n;
        
        System.out.println(result);
    }
}
