import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[a];
        for(int i=0; i<a; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println(arr[b-1]);

    }
}