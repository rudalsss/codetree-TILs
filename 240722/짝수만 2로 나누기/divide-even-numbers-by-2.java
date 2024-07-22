import java.util.Scanner;

public class Main {
    public static void modify(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0) arr[i] /=2;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        modify(arr);
        for(int i=0; i<a; i++){
            System.out.print(arr[i]+" ");
        }

    }
}