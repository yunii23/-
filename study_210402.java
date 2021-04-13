import java.util.Scanner;
import java.util.StringTokenizer;


//울타리 잘라내기
// s = (r-l+1) * min h[i]
// h[i]는 높이 중 제일 짧은거 나타냄. 넓이 다 구해서 그 중 최대값 리턴하면 답
public class study_210402 {
    static int n; //판자수
    static String[] arr;
    static int[] h;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("tc");
        int tc = sc.nextInt();

        for(int i=0; i<tc; i++) {
            System.out.println("n");
            n = sc.nextInt();

            String s = sc.nextLine();

            StringTokenizer st = new StringTokenizer(s, " ");
            arr = new String[st.countTokens()];

            System.out.println(st.countTokens());
            int k=0;
            while(st.hasMoreElements()){
                
                arr[k++] = st.nextToken();
                System.out.println(arr[k]);
            }

            h = new int[arr.length];
            for(int j=0; j<arr.length; j++) {
                h[j] = Integer.parseInt(arr[j]);
            }

            //solve(0, n-1);
        }

        sc.close();
    }

    public static int solve(int left, int right) { 
        // 기저 사례 : 판자가 하나밖에 없는 경우 
        if(left==right) 
            return h[left]; // [left, mid], [mid+1, right]의 두 구간으로 문제를 분할한다. 

        int mid = (left + right) / 2; // 분할한 문제를 각개격파 
        int ret = Math.max(solve(left, mid), solve(mid+1, right)); 
        
        // 부분 문제 3 : 두 부분에 모두 걸치는 사각형 중 가장 큰 것을 찾는다. 
        int lo = mid, hi = mid+1; 
        int height = Math.min(h[lo], h[hi]); 
        
        // [mid, mid+1]만 포함하는 너비 2인 사각형을 고려한다. 
        ret = Math.max(ret, height*2); 
        
        // 사각형이 입력 전체를 덮을 때까지 확장해 나간다. 
        while(left < lo || hi < right) { 
            // 항상 높이가 더 높은 쪽으로 확장한다. 
            
            if(hi < right && (lo == left || h[lo-1] < h[hi+1])) { 
                ++hi; height = Math.min(height, h[hi]); 
            } else {
                 --lo; height = Math.min(height, h[lo]); 
            } 
            
            // 확장한 후 사각형의 넓이 
            ret = Math.max(ret, height * (hi - lo + 1)); 
        } 
        
        return ret; 
    }


}
