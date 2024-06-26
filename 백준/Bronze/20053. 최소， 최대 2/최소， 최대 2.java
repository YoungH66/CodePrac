import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++)
            {
                int num = Integer.parseInt(st.nextToken());
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            System.out.println(min + " " + max);
        }
    }
}