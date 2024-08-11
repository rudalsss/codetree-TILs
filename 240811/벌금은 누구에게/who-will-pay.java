import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //학생수
        int m = sc.nextInt(); //벌칙 학생번호 = 타겟
        int k = sc.nextInt(); //벌금 벌칙횟수

        int[] targets = new int[m];
        for(int i=0; i<m; i++) targets[i] = sc.nextInt();

        int[] cnt = new int[n+1]; //학생이 벌칙받은 횟수

        int student = -1;
        for(int i=0; i<m; i++){
            int target = targets[i];
            cnt[target]++;
            if(cnt[target]>=k){
                student = target;
                break;
            }
        }
        System.out.println(student);
    }
}