import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] people = new int[n];
        for(int i=0; i<n; i++) people[i] = sc.nextInt();

        int sumDiff = 0;
        int min = 0;
        for(int j=0; j<n; j++){
            for(int i=0; i<n; i++){
                sumDiff += people[i] * Math.abs(i-j);
            }
            if(sumDiff<min) min = sumDiff;
        }

        System.out.println(min);
    }
}