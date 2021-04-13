
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;


public class study_210406 {
    static int N, D, P, T, d_copy;
    static int target;
    static int[][] A;
    static int[] t;
    static List<Integer> vList[];
    static double[][] cache;

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int i=0; i<tc; i++) {
            N = sc.nextInt(); // 지도의 마을 수
            D = sc.nextInt(); // 탈출 후 지금까지 지난 일 수
            P = sc.nextInt(); // 교도소가 있는 마을 번호

            cache = new double[N][101];
            for(int j=0; j<N; j++) {
                for(int k=0; k<101; k++){
                    cache[j][k] = -1;
                }
            }


            A = new int[N][N]; //행렬 A

            vList = new ArrayList[N];
            for(int j=0; j<vList.length; j++) {
                vList[i] = new ArrayList<Integer>();
                
            }

            for(int j=0; j<N; j++){
                for(int k=0; k<N; k++){
                    A[j][k] = sc.nextInt();

                    //i번 행의 j가 1인 경우 마을 이어짐
                    if(A[j][k] == 1) {
                        vList[j].add(k);
                        System.out.println(vList[j]);
                    }
                }                
            }


            //확률 계산할 마을 수
            T = sc.nextInt();

            //확률 게산할 마을 번호
            t = new int[T];
            for(int j=0; j<T; j++) {
                t[j] = sc.nextInt(); 
            }

            getRate(P, 0);



            for(int j=0; j<T; i++) {
                target = t[i];
                
                double rate = getRate(P, 0);
                System.out.println("%0.8f" + rate);
            }


        }

        sc.close();
    }



    public static double getRate(int here, int days) {
        System.out.println("dd" + here + days);
        if (days == D) {
            if(target == here) {
                return 1.0;
            }

            return 0.0;
        }


        if(cache[here][days] > -0.5) {
            return cache[here][days];
        }


        //인접리스트
        List<Integer> adjList = vList[here];

        double ret = 0.0;
        for(int i=0; i<adjList.size(); i++){
            int next = adjList.get(i);
            double result = getRate(next, days+1) / adjList.size();
            ret += result;
        }

        cache[here][days] = ret;

        return ret;
    }
}
