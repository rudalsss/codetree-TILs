import java.util.Scanner;

public class Main {
    public static boolean check(String str){
        for(int i=0; i<str.length(); i++){
            if( str.charAt(i) != str.charAt(i+1) ) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if(check(str)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}