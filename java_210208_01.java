public class java_210208_01 {
    //백준 함수 셀프 넘버
    public static void main(String[] args) {
        
        boolean[] check = new boolean[10001];
        for(int i=1; i<101; i++){
            int n = value(i);

            if(n<101) {
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<101; i++) {
            if(!check[i]) {
                //false만 출력
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static int value(int num) {
        int sum = num;
    
        while(num != 0) {
            sum = sum + (num % 10);
            num = num/10;
        }
        
        return sum;
    }
    
}

