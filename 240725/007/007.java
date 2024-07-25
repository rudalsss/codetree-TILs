import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        A obj = new A(a,b,c);
        System.out.println(obj);
    }
}

class A{
    public String secretCode;
    public char meetingPoint;
    public int time;

    public A(String a, char b, int c){
        this.secretCode = a;
        this.meetingPoint = b;
        this.time = c;
    }

    public String toString(){
        return "secret code : "+this.secretCode+"\n"
        +"meeting point : "+this.meetingPoint+"\n"
        +"time : "+this.time;
    }
}