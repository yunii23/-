import java.util.HashMap;
import java.util.Scanner;

public class study_210319 {
    static String A;
    static String B;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        //테스트 케이스 받음
        int tc = sc.nextInt();

        int a = 0;
        int b = 0;

        for(int i=0; i<tc; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            map.clear();

            for(int j=0; j<a; j++){
                map.put(sc.nextInt(), j);
            }

            for(int j=0; j<b; j++){
                map.put(sc.nextInt(), j);
            }

            System.out.println("사이즈"+map.size());
        }

        sc.close();
    }
}
