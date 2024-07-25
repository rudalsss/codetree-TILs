import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        Product product1 = new Product("codetree", 50);
        Product product2 = new Product(a,b);

        System.out.println(product1);
        System.out.println(product2);


    }
}


class Product{
    public String name;
    public int code;

    public Product(String name, int code){
        this.name = name;
        this.code = code;
    }

    public String toString(){ 
        return "product "+code+" is "+name;
    }
}