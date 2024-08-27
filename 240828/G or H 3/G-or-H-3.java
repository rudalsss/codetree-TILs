import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 유효 수
        int k = sc.nextInt(); // 사진의 크기

        int[] location = new int[n]; // 위치 입력값
        char[] score = new char[n];  // 점수 입력값
        for(int i=0; i<n; i++){
            location[i] = sc.nextInt();
            score[i] = sc.next().charAt(0);
        }

        // 최대위치값 구하여 place 만들
        // place : 실제 위치에 점수반영해서 입력
        int m = 0;
        for(int i=0; i<n; i++) m = Math.max(location[i], m);
        int[] placeScore = new int[m+1]; //최대값만큼의 공간확보(0무시)
        for (int i = 0; i < n; i++) {
            if (score[i] == 'G') {
                placeScore[location[i]] = 1;
            } else if (score[i] == 'H') {
                placeScore[location[i]] = 2;
            }
        }


        int maxScore = 0;
        for(int i=1; i<=m-k+1; i++){
            int sumScore = 0;
            for(int j=i; j<=i+k && j<=m; j++){
                sumScore += placeScore[j];
            }
            maxScore = Math.max( sumScore, maxScore );
        }

        System.out.println(maxScore);


    }
}