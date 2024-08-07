import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            if(num<n) {
                arr.add(num);
                break;
            }
            arr.add(num%n);
            num /= n;
        }
        Collections.reverse(arr);
        
        for(int i=0; i<arr.size(); i++) System.out.print(arr.get(i));
    }
}