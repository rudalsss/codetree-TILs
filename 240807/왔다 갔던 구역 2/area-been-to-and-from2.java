import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[20*n];
        for(int i=0; i<arr.length; i++) arr[i] = 0;

        int[] size = new int[n];
        char[] dir = new char[n];
        for(int i=0; i<n; i++){
            size[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);
        }

        int start = 10*n;
        for(int i=0; i<n; i++){
            if(dir[i]=='R'){
                for(int j=0; j<size[i]; j++){
                    arr[start]++;
                    start++;
                }
            } else {
                for(int j=0; j<size[i]; j++){
                    arr[start]++;
                    start--;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=2) cnt++;
        }

        System.out.println(cnt);
    }
}