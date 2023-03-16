package Loop;

import java.util.Scanner;
public class mulAplusB_10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int arr[] = new int[s];

        for(int i = 0; i < s; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a + b;
        }
        in.close();

        for(int k : arr) {
            System.out.println(k);
        }


    }
}
