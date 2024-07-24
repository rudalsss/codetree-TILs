import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxIdx = 0;
        for(int i=0; i<a; i++){
            if(arr[i]>=max) {
                max = arr[i];
                maxIdx = i-1;
            }
        }
    
        System.out.print(maxIdx+" ");

        for(int i=0; i<maxIdx; i++){
            if(arr[i]>=max) {
                max = arr[i];
                maxIdx = i-1;
            }
            if(maxIdx==1) break;
        }
        
        System.out.print(maxIdx+" ");
    


    }
}