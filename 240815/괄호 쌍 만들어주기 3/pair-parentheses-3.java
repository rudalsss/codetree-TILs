import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cnt = 0;
        int start = 0;
        for(int i=start; i<str.length(); i++){
            if( str.charAt(i)=='(' ) {
                start = i;
                for(int j=start+1; j<str.length(); j++){
                    if(str.charAt(j)==')') cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}