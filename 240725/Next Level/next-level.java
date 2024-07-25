import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        A obj1 = new A("codetree", 10);
        A obj2 = new A(a, b);

        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class A{
    private String id;
    private int level;

    public A(String id, int level){
        this.id = id;
        this.level = level;
    }

    public String toString(){
        return "user "+this.id+" lv "+this.level;
    }
}