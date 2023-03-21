package Loop;

import java.util.Scanner;
public class long_25314 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        String str = "";
        in.close();

        for(int i = 0; i<a/4; i++) {
            str += "long ";
        }
        System.out.println(str + "int");
    }
}
