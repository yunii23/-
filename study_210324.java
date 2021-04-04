import java.util.Scanner;

//숫자게임
//현우부터 게임 시작
//왼쪽 끝에 있는 숫자나 오른쪽 끝에 있는 숫자 중 하나를 가져감
//게임판에 두 개 이상의 숫자가 있을 경우, 왼쪽 끝에서 두개, 또는 오른쪽 긑에서 두개 지움
//play(state) = 현재 게임판에 남은 수들이 state일때 (이번 차례 참가자 점수 - 다른 참가자 점수 최대치_)
// 현우 - 서하
// 부호 뒤집으면 서하-현우
public class study_210324 {
    static int n;
    static int[] board = new int[50];
    static int[][] cache = new int[50][50]; // 범위 -50까지
    static int EMPTY = -987654321; // -50000~50000 범위 밖의 값, 아직 답이 계산되지 않았음

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력1: ");
        int tc = sc.nextInt();

        for(int i=0; i<tc; i++) {
            System.out.println("입력2: ");
            n = sc.nextInt(); // 길이

            for(int j=0; j<50; j++) {
                for(int k=0; k<50; k++) {
                    cache[j][k] = EMPTY;
                }
            }

            System.out.println("입력3: ");
            //String[] s = sc.nextLine().split(" ");
            //String[] arr = s.split(" ");
            for(int j=0; j<n; j++) {
                board[j] = sc.nextInt();
            }

            System.out.println(play(0, n-1));
        }


        sc.close();
    }


    //play(state, player)
    public static int play(int left, int right) {
        //기저사례 - 모든 수가 다 없어졌을 때
        if(left > right) return 0;

        int ret = cache[left][right];
        if(ret != EMPTY) return ret;

        //수를 가져가는 경우
        //제일 왼쪽 점수에 상대방이 그 다음 게임에서 얻는 최대 점수 빼는 경우
        //오른쪽 점수를 가져가는 경우 중 최대 값
        ret = Math.max(board[left] - play(left + 1, right), board[right] - play(left, right - 1));
    
        //수를 없애는 경우 - 수가 두개이상일때만 가능
        if(right - left + 1 >= 2) {
            ret = Math.max(ret, -play(left + 2, right)); //왼쪽 두개
            ret = Math.max(ret, -play(left, right - 2)); //오른쪽 두개
        } 

        return ret;
    }
}
