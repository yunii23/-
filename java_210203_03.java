public class java_210203_03 {
    //백준 함수 정수 N개의 합

    class Test {
        long sum(int[] a) {
            long ans = 0;
            for(int i  = 0; i < a.length; i++){
                ans += a[i];
            }
            return ans; //정수배열이라서 long
        }
    }
}
