import java.util.Scanner;

public class java_210208_02 {
    //백준 함수 한수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1~99는 모두 한수
        // 100~999는 자리 수를 구하여 저장한 후, 등차 수열인지 판별하여 개수 더함
        
        System.out.println(han(sc.nextInt()));

        sc.close();

    }

    public static int han(int n) {
        int count = 0;

        if(n<100) {
            return n; //바로 return 하면 반복문 돌 필요없이 바로 출력가능
        }
        
        else {
            //100이상이면
            count = 99; //100이상의 수가 들어오면 최소 한수의 개수는 99이므로 99로 초기화

            if(n == 1000) { //예외처리 - 1000은 등차수열이 아니고 그 보다 큰 수는 받지 않기 때문에   
                n = 999;
            }

            
            for(int i=100; i<=n; i++) {
                int hun = i/100;
                int ten = (i/10)%10; // /10으로 몫을 구한 뒤 해당 몫에 10을 나눈 나머지가 십의 자릿수 
                int one = i%10;

                if((hun-ten) == (ten - one)) {
                    count++;
                }
            }
        }

        return count;
    }
    
}
