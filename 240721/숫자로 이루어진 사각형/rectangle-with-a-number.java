import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m=1;

        for(int j=0; j<n; j++){
            for(int i=0; i<n; i++){
                System.out.print(m+" ");
                m = (m == 9) ? 1 : m + 1;
            }
            System.out.println();
        }

        


    }
}