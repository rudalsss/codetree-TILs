import java.util.Scanner;

public class Main {
    public static int maxx(int[] arr, int idx){
        if(idx == 1) return arr[0];

        int max = maxx(arr, idx-1);

        if(arr[idx-1]>max){
            max = arr[idx-1];
        } 
        return max;
        
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxx(arr, a));
    }
}