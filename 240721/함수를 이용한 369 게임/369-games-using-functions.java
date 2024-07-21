import java.util.Scanner;

public class Main {
// 숫자에 3, 6, 9 중 하나가 포함되어 있는지 확인하는 함수
    public static boolean contains369(int num) {
        String strNum = Integer.toString(num);
        return strNum.contains("3") || strNum.contains("6") || strNum.contains("9");
    }

    // 숫자가 3의 배수인지 확인하는 함수
    public static boolean isMultipleOf3(int num) {
        return num % 3 == 0;
    }

    // 주어진 범위 내에서 조건을 만족하는 숫자의 개수를 세는 함수
    public static int countNumbers(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (contains369(i) || isMultipleOf3(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 정수 a와 b 입력 받음
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // countNumbers 함수를 호출하여 결과를 저장
        int result = countNumbers(a, b);
        
        // 결과 출력
        System.out.println(result);
    }
}