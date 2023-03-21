package Loop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class longBuffer_25314 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int longnum = n / 4;

        for(int i = 0; i< longnum; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
