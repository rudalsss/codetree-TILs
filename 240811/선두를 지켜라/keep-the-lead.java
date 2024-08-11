import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //a의 이동횟수
        int m = sc.nextInt(); //b의 이동횟수

        int[] velocityA = new int[n];
        int[] timeA = new int[n];
        int[] velocityB = new int[m];
        int[] timeB = new int[m];

        int timesize = 0;
        for(int i=0; i<n; i++){
            velocityA[i] = sc.nextInt();
            int time = sc.nextInt();
            timesize += time;
            timeA[i] = time;
        }

        for(int i=0; i<m; i++){
            velocityB[i] = sc.nextInt();
            timeB[i] = sc.nextInt();
        }

        int[] locationA = new int[timesize+1];
        int[] locationB = new int[timesize+1];
        
        //a의 시간별 위치기록
        int index = 0;
        int location = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<=timeA[i]; j++){
                location += velocityA[i];
                locationA[index+j] = location;
            }
            index += timeA[i];
        }

        //b의 시간별 위치기록
        index = 0;
        location = 0;
        for(int i=0; i<m; i++){
            for(int j=1; j<=timeB[i]; j++){
                location += velocityB[i];
                locationB[index+j] = location;
            }
            index += timeB[i];
        }

        // for(int i=0; i<=timesize; i++) System.out.print(locationA[i]+" ");
        // System.out.println();
        // for(int i=0; i<=timesize; i++) System.out.print(locationB[i]+" ");

        int cnt = 0;
        for(int i=0; i<=timesize; i++){
            if( i!=0 && locationA[i-1]<=locationB[i-1] && locationA[i]>locationB[i] ) cnt++;
            if( i!=0 && locationA[i-1]>=locationB[i-1] && locationA[i]<locationB[i] ) cnt++;
        }
        System.out.println(cnt-1); //처음순간제외


    }
}