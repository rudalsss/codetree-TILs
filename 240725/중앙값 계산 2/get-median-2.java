import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        //n개의 숫자를 입력받음
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if((i+1)%2!=0){
                int[] temp = new int[i+1];
                for(int j=0; j<i+1; j++){
                    temp[j] = arr[j];
                }
                Arrays.sort(temp);
                System.out.print(temp[(i+1)/2]+" ");
            }
        }
    }
}