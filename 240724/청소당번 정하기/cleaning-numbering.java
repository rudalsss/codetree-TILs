import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int restroomCleanCount = a / 12; // 12일 주기로 청소하는 횟수
        int hallwayCleanCount = (a / 3) - restroomCleanCount; // 3일 주기로 청소하는 횟수에서 12일 주기 겹침 제외
        int classroomCleanCount = (a / 2) - (a / 6) - restroomCleanCount; // 2일 주기로 청소하는 횟수에서 6일 주기와 12일 주기 겹침 제외

        System.out.print(classroomCleanCount + " " + hallwayCleanCount + " " + restroomCleanCount);
    }
}