import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for(int i=a; i<=b; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) sum+= i;
        }

        System.out.println(sum);
    }
}