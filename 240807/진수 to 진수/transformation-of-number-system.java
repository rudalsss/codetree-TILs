import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //주어지는 진수
        int b = sc.nextInt(); //변환하는 진수
        String n = sc.next();

        int num = 0;
        for(int i=0; i<n.length(); i++){
            num = a*num + ( n.charAt(i) - '0' );
        }

        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            if(num<b){
                arr.add(num);
                break;
            }

            arr.add(num%b);
            num /= b;
        }
        Collections.reverse(arr);

        for(int i=0; i<arr.size(); i++) System.out.print(arr.get(i));
    }
}