import java.util.Scanner;

// 백준 1차원 배열 숫자의 개수 
public class java_210202_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        sc.close();

        int result = n1 * n2 * n3;

        System.out.println(result);

        int value = 0;
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        int sum = (int)(Math.log10(result)+1);

        for (int i=0; i < sum; i++) {
            value = result % 10;
            System.out.println("sss"+value);

            if(value == 0) {
                arr[0]++;
            }else if(value == 1) {
                arr[1]++;
            }else if(value == 2) {
                arr[2]++;
            }else if(value == 3) {
                arr[3]++;
            }else if(value == 4) {
                arr[4]++;
            }else if(value == 5) {
                arr[5]++;
            }else if(value == 6) {
                arr[6]++;
            }else if(value == 7) {
                arr[7]++;
            }else if(value == 8) {
                arr[8]++;
            }else if(value == 9) {
                arr[9]++;
            }

            result = result / 10;
        }

        for (int j = 0; j<arr.length; j++) {
            System.out.println(arr[j]);
        }
        
    }
    

}
