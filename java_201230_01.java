// 45분 전 알람시계
public class java_201230_01 {
    //백준 if문 알람시계
    public static void main(String[] args) {
        int H = 23;
        int M = 40;
        int result = 0;

        if (H >= 0 && H <=23 && M >= 0 && M <= 59) {
            if (M < 45) {
                if(H == 0){
                    H = 23;
                    result = 45 - M;
                    result = 60 - result;
                    System.out.printf("%d %d", H, result);
                }else {
                    H = H - 1;
                    result = 45 - M;
                    result = 60 - result;
                    System.out.printf("%d %d", H, result);
                }
            } else {
                result = M - 45;
                System.out.printf("%d %d", H, result);
            }
        }else {
            System.out.println("다시 입력해주세요.");
        }
    }
}