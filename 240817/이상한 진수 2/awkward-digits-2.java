import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int size = String.valueOf(input).length();

        int[] digits = new int[size];
        for(int i=size-1; i>=0; i--){
            digits[i] = input % 10;
            input /= 10;
        }

        int max = 0;
        for(int i=0; i<size; i++){
            if(digits[i]==1) digits[i]=0;
            else digits[i]=1;
            // for(int j=0; j<size; j++) System.out.print(digits[j]+" ");
            // System.out.println();

            int n=0;
            for(int j=0; j<size; j++) n = n * 2 + digits[j];
            // System.out.println(n);
            
            if(n>=max) max = n;
            if(digits[i]==1) digits[i]=0;
            else digits[i]=1;
        }

        System.out.println(max);
    }
}