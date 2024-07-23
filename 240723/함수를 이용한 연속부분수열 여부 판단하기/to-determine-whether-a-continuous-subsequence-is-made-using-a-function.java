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
        // 입력받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 수열 A의 크기 입력받기
        int n1 = sc.nextInt();
        int[] A = new int[n1];
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        // 수열 B의 크기 입력받기
        int n2 = sc.nextInt();
        int[] B = new int[n2];
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        // 수열 B가 수열 A의 연속 부분 수열인지 확인
        if (isSubsequence(A, B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Scanner 객체 닫기
        sc.close();
    }
}