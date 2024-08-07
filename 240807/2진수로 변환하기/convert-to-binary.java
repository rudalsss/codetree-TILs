import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        while(true){
            if(n<2){
                arr.add(n);
                break;
            }
            arr.add(n % 2); 
            n /= 2;
        }

        Collections.reverse(arr);
        for(int i=0; i<arr.size(); i++) System.out.print(arr.get(i));

    }
}