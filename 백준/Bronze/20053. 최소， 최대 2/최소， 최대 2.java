import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            for(int i = 0; i < t; i++) {
                int n = Integer.parseInt(br.readLine());
                int maxNum = -1000000;
                int minNum = 1000000;
                int[] nums = new int[n];
                String[] line = br.readLine().split(" ");
                for(int j = 0; j < n; j++) {
                    nums[j] = Integer.parseInt(line[j]);
                }
                for(int j = 0; j < n; j++) {
                    if(nums[j] > maxNum) {
                        maxNum = nums[j];
                    }
                    if(nums[j] < minNum) {
                        minNum = nums[j];
                    }
                }
                System.out.println(minNum + " " + maxNum);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
