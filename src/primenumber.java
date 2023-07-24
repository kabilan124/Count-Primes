import java .util.*;
public class primenumber {
    public static boolean prime(int N) {
        if (N == 1 || N == 0) return false;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int[] number = new int[num];
        // Scanner sc = new Scanner(System.in);
        // num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (prime(i)) {

                System.out.println(i);
            }
        }

    }
}