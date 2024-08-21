import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // 남아 있는 줄 바꿈 문자 처리
        String str = sc.nextLine();

        int cnt = 0;
        for(int i=0; i< n; i++){
            for(int j=i+1; j< n; j++){
                for(int k=j+1; k< n; k++){
                    if(str.charAt(i)=='C' && str.charAt(j)=='O' && str.charAt(k)=='W') cnt++;            
                }
            }
        }

        System.out.println(cnt);

    }
}