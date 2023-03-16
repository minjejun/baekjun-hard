package Loop;

import java.util.Scanner;
public class gugudan_2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();

        for(int i = 1;i < 10; i++) {
            System.out.println(A + " * " + i + " = " + (A * i));
        }

        in.close();
    }
}
