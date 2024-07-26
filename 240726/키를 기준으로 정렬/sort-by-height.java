import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        Person[] arr = new Person[a];
        for(int i=0; i<a; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int age = sc.nextInt();
            arr[i] = new Person(name, height, age);
        }

        while(a>0){
            for(int i=0; i<a-1; i++){
                if(arr[i].getHeight() > arr[i+1].getHeight()){
                    Person tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }            
            a--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}


class Person{
    private String name;
    private int height;
    private int age;

    public Person(String name, int height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String toString(){
        return name+" "+height+" "+age;
    }

    public int getHeight(){
        return height;
    }
}