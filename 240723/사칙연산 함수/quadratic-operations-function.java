import java.util.Scanner;

public class Main {
    public static int add(int a, int b){
        return a+b;
    }
    public static int min(int a, int b ){
        return a-b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int b = sc.nextInt();

        if(o=='*') {
            System.out.print(a+" * "+b+" = "+mult(a,b));
        } else if(o=='-') {
            System.out.print(a+" - "+b+" = "+min(a,b));
        } else if(o=='/') {
            System.out.print(a+" / "+b+" = "+div(a,b));
        } else if(o=='+') {
            System.out.print(a+" + "+b+" = "+add(a,b));
        } else {
            System.out.println("False");
        }


    }
}