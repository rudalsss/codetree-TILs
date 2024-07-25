import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int c = sc.nextInt();

        Bomb bomb = new Bomb(a,b,c);
        System.out.print(bomb);
    }
}

class Bomb{
    private String code;
    private String color;
    private int second;

    public Bomb(String code, String color, int sec){
        this.code = code;
        this.color = color;
        this.second = sec;
    }

    public String toString(){
        return "code : "+code+"\ncolor : "+color+"\nsecond : "+second;
    }
}