import java.util.Scanner;

public class study_210401 {
    private static int INF = 9999;
    private static int SWITCHES = 10;
    private static int CLOCKS = 16;

    // linked[i].charAt(idx) = 'x': i번 스위치와 idx번 시계가 연결되어 있다.
    // linked[i].charAt(idx) = '.': i번 스위치와 idx번 시계가 연결되어 있지 않다.

    private static final String linked[] = {
            // 0123456789012345
            "xxx.............", 
            "...x...x.x.x....", 
            "....x.....x...xx", 
            "x...xxxx........", 
            "......xxx.x.x...",
            "x.x...........xx", 
            "...x..........xx", 
            "....xx.x......xx", 
            ".xxxxx..........", 
            "...xxx...x...x.." 
        };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ret ="";

        System.out.println("테스트 케이스: ");
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            System.out.println("시간 입력");
            //String clock = sc.nextLine();

            //String[] arr = clock.split(" ");

            // int로 시간 담을 배열
            int clocks[] = new int[CLOCKS];

            for (int j = 0; j < CLOCKS; j++) {
                clocks[j] = sc.nextInt();
            }

            int temp = solve(clocks, 0);

            ret += temp >= INF ? String.valueOf(String.format("%d%n",-1)) : String.valueOf(String.format("%d%n", temp));
        }

        System.out.print("답"+ret.toString());
        sc.close();
    }


    // clocks 현재 상태
    // num 스위치 번호
    public static int solve(int clocks[], int num) {

        //만약 불가능하다면 INF 이상의 큰 수를 반환한다.
		if(num == SWITCHES) return areAligned(clocks) ? 0 : INF;

		int ret = INF;

		//이 스위치를 0번 누르는 경우부터 세 번 누르는 경우까지를 모두 시도한다.
		for(int cnt = 0; cnt < 4; ++cnt) {

            // 다음 스위치를 누르는 경우의 리턴값 받아서 작은 값 뽑기
			ret = Math.min(ret, cnt + solve(clocks, num + 1));

			push(clocks, num);
		}

		//push(clocks, num)가 네 번 호출되었으니 clocks는 원래와 같은 상태가 된다.
		return ret;
    }


    // 모든 시계가 12시를 가리키고 있는지 확인한다.
    public static boolean areAligned(int clocks[]) {

        boolean ret = false;

        for (int i = 0; i < clocks.length; ++i) {

            if (clocks[i] == 12)
                ret = true;

            // 하나라도 12시를 가리키지 않는다면 바로 false를 반환한다.
            else
                return false;
        }

        return ret;
    }



    // swtch번 스위치를 누른다.
    // 3 6 9 12 시 변경되는 부분
    public static void push(int clocks[], int swtch) {

        // 시계의 개 수(16)만큼 반복한다.
        for (int clock = 0; clock < CLOCKS; ++clock) {

            // swtch번 스위치가 해당 clock와 연결 되어 있다면
            if (linked[swtch].charAt(clock) == 'x') {

                // 3을 추가한다.
                clocks[clock] += 3;

                // 12을 넘어가면 3으로 초기화 한다.
                if (clocks[clock] == 15)
                    clocks[clock] = 3;
            }
        }
    }
}
