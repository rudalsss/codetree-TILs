import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = 0;
        for(int i=0; i<str.length(); i++){
            num = num*2 + (str.charAt(i)-'0');
        }

        num *= 17;

        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            if(num<2){
                arr.add(num);
                break;
            }

            arr.add(num%2);
            num /= 2;
        }
        Collections.reverse(arr);

        for(int i=0; i<arr.size(); i++) System.out.print(arr.get(i));
    }
}