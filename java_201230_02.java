public class java_201230_02 {
    //백준 for문 별 찍기 1
    public static void main(String[] args) {
        int n = 10;

        for (int i=1; i<=n; i++){
            for (int j =1; j<=n; j++){
                if (j <= i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }
}
