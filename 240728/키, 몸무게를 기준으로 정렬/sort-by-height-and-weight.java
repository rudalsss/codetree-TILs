import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        Person[] arr = new Person[a];
        for(int i=0; i<a; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Person(name, height, weight);
        }
        
        Arrays.sort(arr, new Comparator<Person>(){
            public int compare(Person a, Person b){
                if(a.height != b.height){
                    return a.height - b.height;
                } else {
                    return b.weight - a.weight;
                }
            }
    });

        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }

    }
}

class Person {
    String name;
    int height;
    int weight;

    public Person(String n, int h, int w){
        this.name = n;
        this.height = h;
        this.weight = w;
    }

    public String toString(){
        return name +" "+height+" "+weight; 
    }
}