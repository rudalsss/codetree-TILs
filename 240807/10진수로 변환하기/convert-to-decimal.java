import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            arr.add(Character.getNumericValue(input.charAt(i)));
        }

        int num = 0;
        for(int i=0; i<arr.size(); i++){
            num = num*2 + arr.get(i);
        }

        System.out.println(num);


    }
}