import java.util.Scanner;

public class java_210209_02 {
    //백준 문자열 알파벳 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String n = "abcdefghijklmnopqrstuvwxyz";
        int[] a;
        a = new int[n.length()];

        for(int i=0; i<n.length(); i++) {
            a[i] = -1;
        }

        sc.close();

        if(s.length() < 100) {
            s = s.toLowerCase();

            for(int i=0; i<s.length(); i++) {
                for(int j=0; j<n.length(); j++) {

                    if(s.charAt(i) == n.charAt(j)){

                        if(a[j] == -1) {
                            a[j] = i;
                        }
                    }

                }
            }
        }

        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        
    }
}
