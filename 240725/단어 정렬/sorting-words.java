import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String[] all = new String[a];

        for(int i=0; i<a; i++){
            String str = sc.next();
            all[i] = str;
        }

        Arrays.sort(all);
        for(int i=0; i<a; i++){
            System.out.println(all[i]);
        }



    }
}