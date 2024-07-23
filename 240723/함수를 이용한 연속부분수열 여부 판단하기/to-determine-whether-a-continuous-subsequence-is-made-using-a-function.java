import java.util.Scanner;

public class Main {

    public static boolean isSubsequence(int[] A, int[] B) {
        int n1 = A.length;
        int n2 = B.length;

        for (int i = 0; i <= n1 - n2; i++) {
            boolean isMatch = true;
            for (int j = 0; j < n2; j++) {
                if (A[i + j] != B[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int[] A = new int[n1];
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        
        int[] B = new int[n2];
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        if (isSubsequence(A, B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}