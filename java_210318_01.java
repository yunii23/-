import java.util.Scanner;

public class java_210318_01 {
    //백준 쿼드트리

    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //if(1<=N && N<=64)

        arr = new int[N][N];

        for(int i=0; i<N; i++) {
            String[] temp = sc.next().split("");
            for(int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }

        
     

        sc.close();
    }
}
