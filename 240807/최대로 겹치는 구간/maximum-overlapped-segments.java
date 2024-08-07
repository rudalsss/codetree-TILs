import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[200];
        for(int i=0; i<arr.length; i++) arr[i] = 0;

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j=a+100; j<b+100; j++){
                arr[j]++;
            }
        }

        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) max = arr[i];
        }
        System.out.println(max);
    }
}