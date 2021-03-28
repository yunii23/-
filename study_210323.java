import java.util.Scanner;


public class study_210323 {
    public static int N; 
    public static int cache[];
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for(int i=0; i<tc; i++) {
            N = sc.nextInt();

            cache = new int[N+1];

            for(int j=0; j<cache.length; j++) {
                cache[j] = -1; 
            }
   
            //int result = tiling(N); 

            //System.out.println("얘 시작");
            //int dup = tiling((N/2)+1);

            //System.out.println(result);
            //System.out.println(dup);
            //System.out.println((result-dup+mod)%mod + "\n");

            System.out.println(asymmetric(N));
        }
        sc.close();
    }

    
    //전체 수 
    public static int tiling(int n) {
        //기저사례 n이 1일때
        if(n <= 1) { 
            System.out.println("1들어옴");
            return 1; 
        } 
        
        //메모이제이션
        if(cache[n] != -1) { 
            System.out.println("2들어옴");
            return cache[n]; 
        } 
        
        //가로로 두개를 끼워놓는 경우 혹은 세로로 1개를 끼워놓는 경우
        System.out.println("-----");
        cache[n] = (tiling(n-1) + tiling(n-2))%mod;
        System.out.println("3들어옴"+cache[n]); 
        
        // cache[n] = tiling(n-2) % mod; //a
        // cache[n] = (cache[n] + tiling(n-4)) % mod; //b
        // cache[n] = (cache[n] + tiling(n-3)) % mod; //c
        // cache[n] = tiling(n-2) % mod; //d
        
        return cache[n]; 
    }

    public static int asymmetric(int n) {
        if(n % 2 == 1) {
            System.out.println("여기1");
            return (tiling(n) - tiling(n/2) + mod) % mod;
        }

        System.out.println("여기2");
        //전체
        int ret = tiling(n);

        System.out.println("여기3");
        //짝 홀
        ret = (ret - tiling(n/2) + mod) % mod;

        System.out.println("여기4");
        ret = (ret - tiling(n/2-1) + mod ) % mod;
        
        return ret;
    }
}
