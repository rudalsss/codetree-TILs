import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sortedArr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sortedArr[i] = sc.nextInt();
        }

        Arrays.sort(sortedArr);

        int[] answer = new int[n];
        boolean[] used = new boolean[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]==sortedArr[j] && used[j]==false ){
                    answer[i] = j+1;
                    used[j] = true;
                    break;
                }
            }
        }

        for(int i=0; i<n; i++)
            System.out.print(answer[i]+" ");

        
    }
}