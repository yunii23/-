import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class study_210326 {

    static int num;
    static Integer[] eatTime;
    static Integer[] warmTime;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("테스트케이스: ");
        int tc = sc.nextInt();
        Integer sum;
        Integer result;

        for(int i=0; i<tc; i++) {
            // 1 도시락 수 2 돌리는 시간 3 먹는 시간
            System.out.println("도시락 수: ");
            num = sc.nextInt();
            eatTime = new Integer[num];
            warmTime = new Integer[num];

            sum = 0;
            result = 0;
            String n = "0";
            

            for(int j=0; j<num; j++) {
                System.out.println("데우는 시간: ");
                n = sc.next();
                warmTime[j] = Integer.parseInt(n);
            }

            for(int j=0; j<num; j++) {
                System.out.println("먹는 시간: ");
                n = sc.next();
                eatTime[j] = Integer.parseInt(n);
            }

            Arrays.sort(eatTime, Collections.reverseOrder());

            for(int j=0; j<warmTime.length; j++) {
                sum = sum + warmTime[j];
            }

            for(int j=0; j<eatTime.length; j++) {
                System.out.println("eatTime"+eatTime[j]);
            }

            System.out.println("sum"+sum);
            System.out.println("eatTime[num-1]"+eatTime[num-1]);

            result = sum + eatTime[num-1];

            System.out.println("답" + result);
        }

        sc.close();
    }
}
