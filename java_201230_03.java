public class java_201230_03 {
    //백준 for문 별 찍기 2
    public static void main(String[] args) {
        int n = 10;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
