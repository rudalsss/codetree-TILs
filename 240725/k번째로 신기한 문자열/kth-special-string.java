import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();

        ArrayList<String> strings = new ArrayList<>();

        //str로 시작하는 단어들 검색
        for(int i=0; i<n; i++){
            String s = sc.next();
            if( s.indexOf(str)==0 ) strings.add(s);
        }

        Collections.sort(strings);

        System.out.println(strings.get(k-1));



        
        
    }
}