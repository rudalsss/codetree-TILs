import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체를 생성하여 사용자 입력을 받습니다.
        Scanner sc = new Scanner(System.in);
        
    
        int month = sc.nextInt();

        // 각 달의 일수를 저장하는 배열을 정의합니다.
        int[] daysInMonth = {
            31, // 1월
            28, // 2월
            31, // 3월
            30, // 4월
            31, // 5월
            30, // 6월
            31, // 7월
            31, // 8월
            30, // 9월
            31, // 10월
            30, // 11월
            31  // 12월
        };

        System.out.println(daysInMonth[month - 1]);

        
    }
}