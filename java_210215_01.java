import java.util.Scanner;

public class java_210215_01 {
    //백준 문자열 단어의 개수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        sc.close();

        String[] value = s.split(" ");
        
        System.out.println(value.length);
    }
}
