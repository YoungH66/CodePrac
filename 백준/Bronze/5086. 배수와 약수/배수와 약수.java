import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        do{
            n = sc.nextInt();
            m = sc.nextInt();

            if(n < m){
                if(m % n == 0)
                    System.out.println("factor");
                else System.out.println("neither");
            }
            else if(n > m){
                if(n % m == 0)
                    System.out.println("multiple");
                else System.out.println("neither");
            }
        }while(n != 0 && m != 0);
    }
}
