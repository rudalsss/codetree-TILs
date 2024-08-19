import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cnt = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)=='(' && str.charAt(i+1)=='('){
                for(int j=i+1; j<str.length()-1; j++){
                     if(str.charAt(j)==')' && str.charAt(j+1)==')') cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}