import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class study_210405 {
    //와일드카드

    static char[] wc; //와일드카드 문자열
    static char[] fn; //파일이름 문자열

    static ArrayList<String> fileNameArray;

    static int[][] cache; // -1:계산 x, 1: 일치, 0: 불일치

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        cache = new int[101][101];

        for(int i=0; i<101; i++) {
            for (int j=0; j<101; j++) {
                cache[i][j] = -1;
            }
        }

        for(int i=0; i<tc; i++) {

            String wildcard = sc.next(); //와일드 카드 
            int fileNameNum = sc.nextInt(); // 파일 수

            ArrayList<String> fileNameArray = new ArrayList<String>();

            for(int j=0; j<fileNameNum; j++) {
                fileNameArray.add(sc.next()); // 파일 명
            }

            wc = wildcard.toCharArray();

            solve(wildcard, fileNameArray);
        }

        sc.close();

    }



    public static void solve(String wildcard, ArrayList<String> fileNameArray) {
        ArrayList<String> resFileName = new ArrayList<String>();

        for(int i=0; i<fileNameArray.size(); i++) {

            String temp = fileNameArray.get(i);

            fn = temp.toCharArray();
            if(match(0,0) == 1) {
                resFileName.add(temp);
            }
        }

        //정렬 후 출력
        Collections.sort(resFileName);
        for(String str : resFileName) {
            System.out.println("str "+str);
        };
    }



    public static int match(int wIdx, int fnIdx) {

        //메모이제이션
        if(cache[wIdx][fnIdx] != -1)
            return cache[wIdx][fnIdx];

        //종료되는 경우
        //1. s[pos]와 w[pos]가 대응되지 않는다 
        //2. w끝에 도달 -> 패턴에 *이 없는 경우, 문자열 길이가 같아야 대응된다
        //3. s끝에 도달 -> 패턴 남았지만 문자열이 끝난 경우, 남은 패턴이 *이 아니라면 답은 거짓
        //4. w[pos]가 *인 경우 -> *가 몇 글자에 대응될지 모름 그래서 0글자부터 남은 문자열 길이까지 순회
        //  이때 w의 pos+1 이후를 패턴 w'라 하고, s의 pos+skip 이후를 문자열 s'로 해서 match(w', s')로 호출해서
        //  답이 하나라도 참이면 참

        //1:1 대응, 일치하면 증가 후 재귀호출
        if(wIdx < wc.length && fnIdx < fn.length){
            if(wc[wIdx] == '?' || wc[wIdx] == fn[fnIdx]) {
                return cache[wIdx][fnIdx] = match(wIdx+1, fnIdx+1);
            }
        }

        //와일드카드와 파일명 모두 끝에 도달, 파일명도 끝에 도달해야 일치
        if(wIdx == wc.length){
            return cache[wIdx][fnIdx] = (fnIdx == fn.length)? 1:0;
        }

        // * 문자를 만난 경우
        if(wc[wIdx] == '*') {
            if(match(wIdx + 1, fnIdx) == 1 || (fnIdx < fn.length && match(wIdx, fnIdx+1) ==1)){
                return cache[wIdx][fnIdx] =1;
            } 
        }


        return cache[wIdx][fnIdx] =0;
    }
}
