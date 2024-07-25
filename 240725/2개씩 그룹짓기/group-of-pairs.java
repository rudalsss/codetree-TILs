import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a*2];
        for(int i=0; i<a*2; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int[] arr2 = new int[a];
        for(int i=0; i<a; i++){
            arr2[i] = arr[i] + arr[a*2-i-1];
        }
        Arrays.sort(arr2);
        System.out.println(arr2[a-1]);
    }
}