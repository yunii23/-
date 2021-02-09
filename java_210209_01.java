import java.util.Scanner;

public class java_210209_01 {
    //백준 문자열 숫자의 합
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        if(s.length() == n){
            int sum = 0;

            char[] a;
            a = new char[100];
    
            for(int i=0; i<s.length(); i++) {
                a[i] = s.charAt(i);
    
                sum = sum + a[i] -'0';
            }
            
            System.out.println(sum);
            sc.close();
        } else {
            System.out.println("에러");
        }

        
    }
}
