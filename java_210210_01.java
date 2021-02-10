import java.util.Scanner;

public class java_210210_01 {
    //백준 문자열 문자열 반복
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];

        String[] str = new String[n];

        // n 테스트 케이스 입력 받고 케이스 수만큼 반복 횟수, 문자열 받음
        for(int i=0; i<n; i++) {
            num[i] = sc.nextInt();
            str[i] = sc.next();

            // 반복 횟
            for(int j=0; j<str[i].length(); j++) {
                for(int k=0; k<num[i]; k++) {
                    System.out.print(str[i].charAt(j));
                }
            }
        }

        sc.close();
    }
}
