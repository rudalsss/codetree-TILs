import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        Person arr[] = new Person[a];
        for(int i=0; i<a; i++){
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();

            arr[i] = new Person(name, addr, city);
        }

        Arrays.sort(arr);
        System.out.println(arr[a-1]);
    }
}


class Person implements Comparable<Person> {
    public String name;
    private String addr;
    private String city;

    public Person(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
    
    public String toString(){
        return "name "+name+"\naddr "+addr+"\ncity "+city;
    }

    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }
}