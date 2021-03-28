import java.util.Scanner;

public class study_210319_answer {
    public static StringBuilder sb = new StringBuilder();
    static Integer[][] subsets;
    static Integer[] a;
    static Integer[] b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트 케이스 받음
        int tc = sc.nextInt();

        for (int i=0; i<tc; i++) {

            int ans = 0;
            a = new Integer[sc.nextInt()];
            b = new Integer[sc.nextInt()];

            //-1,-1 부분 수열을 둘 다 안합칠때부터 시작하므로
            subsets = new Integer[a.length+1][b.length+1];

            for(int j=0; j<a.length+1; j++) {
                for(int k=0; k<b.length+1; k++) {
                    //System.out.println(j + " " + k);
                    subsets[j][k] = -1;
                }
            }

            for(int j=0; j<a.length; j++) {
                System.out.println("j" + j);
                a[j] = sc.nextInt();
            }

            for(int j=0; j<b.length; j++) {
                System.out.println("j" + j);
                b[j] = sc.nextInt();
            }

            System.out.println("나ㅏ와");
            //실제 답에서 -2
            ans = getMax(-1, -1) -2;
            sb.append(ans).append("\n");
 
        }
        System.out.println("끝");
        System.out.println(sb.toString());

        sc.close();
    }


    public static int getMax(int ai, int bi){
        System.out.println("들어와");

        //만약 값이 있으면 리턴
        if(subsets[ai+1][bi+1] != -1) {
            return subsets[ai+1][bi+1];
        }

        //ai가 -1 이면 long 최솟값, 아니면 a[ai]
        long am = (ai == -1? Long.MIN_VALUE : (long)a[ai]);
        long bm = (bi == -1? Long.MIN_VALUE : (long)b[bi]);

        // 그중 최대 
        long maxnum = Math.max(am, bm);

        //am, bm이 존재(-1 즉 둘 중 하나가 공집합이어도 일단 최소값으로 넣음) 하므로 2개가 있다고 생각
        int sum =2;

        for(int i=ai+1; i<a.length; i++) {
            if(maxnum < a[i]){
                sum = Math.max(sum, getMax(i, bi)+1);
            }
        }

        for(int i=bi+1; i<b.length; i++) {
            if(maxnum < b[i]){
                sum = Math.max(sum, getMax(ai, i)+1);
            }
        }

        subsets[ai+1][bi+1] = sum;
        return sum;
    }
}
