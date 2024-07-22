import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체를 생성하여 사용자 입력을 받습니다.
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 월을 입력받습니다.
        System.out.print("월을 입력하세요 (1-12): ");
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

        // 입력된 월이 유효한지 확인하고 해당 월의 일 수를 출력합니다.
        if (month >= 1 && month <= 12) {
            System.out.println(month + "월은 " + daysInMonth[month - 1] + "일 까지 있습니다.");
        } else {
            System.out.println("잘못된 월을 입력하셨습니다. 1부터 12 사이의 값을 입력하세요.");
        }

        // 스캐너 객체를 닫습니다.
        sc.close();
    }
}