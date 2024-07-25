import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(c1.length != c2.length){
            System.out.println("No");
            return;
        }

        for(int i=0; i<c1.length; i++){
            if(c1[i] == c2[i]){
                continue;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");


    }
}