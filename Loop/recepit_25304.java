package Loop;

import java.util.Scanner;
public class recepit_25304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int X = in.nextInt(); // 총 금액
        int N = in.nextInt(); // 물건의 종류의 수
        int total = 0; // total 정의.

        for(int i = 0;i < N;i++) {
            int a = in.nextInt(); // 각 물건의 가격
            int b = in.nextInt(); // 각 물건의 개수
            total += a * b;
        }
        if(total==X) { // 총 금액과 같다면
            System.out.println("Yes");
        }
        else { // 같지 않다면
            System.out.println("No");
        }

        in.close();
    }
}
