import java.util.Scanner;

public class java_210215_02 {
    //백준 문자열 상수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        sc.close();

        StringBuffer sb1 = new StringBuffer(num1);
        StringBuffer sb2 = new StringBuffer(num2);

        num1 = sb1.reverse().toString();
        num2 = sb2.reverse().toString();

        int n = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        if(n < n2) {
            System.out.println(n2);
        }else{
            System.out.println(n);
        }

    }
}
