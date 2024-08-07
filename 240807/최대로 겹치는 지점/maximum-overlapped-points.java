import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];
        for(int i=0; i<arr.length; i++){
            arr[i] = 0;
        }

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j=a-1; j<b; j++) arr[j]++;
        }

        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }

        System.out.println(max);
    }
}