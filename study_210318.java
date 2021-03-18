import java.util.Scanner;

public class study_210318 {
    
    static String str;
    static int pointer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for(int tc = 0; tc<c; tc++) {
            str = sc.next();
            pointer = 0;
            System.out.println(reverse());
        }

        sc.close();
    }

    public static String reverse() {
        if(str.charAt(pointer) != 'x'){
            return ""+str.charAt(pointer++);
        }

        pointer++;
        String one = reverse();
        String two = reverse();
        String three = reverse();
        String four = reverse();

        return 'x' + three + four + one + two;
    }
}
