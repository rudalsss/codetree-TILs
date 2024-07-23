import java.util.Scanner;

public class Main {
    public static void score(int a){
        if(a>=90){
            System.out.print("A ");
        } else if(a>=80){
            System.out.print("B ");
        } else if(a>=70){
            System.out.print("C ");
        } else if(a>=60){
            System.out.print("D ");
        } else {
            System.out.print("F ");
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while(a<=100){
            score(a);
            a++;
        }

        

    }
}