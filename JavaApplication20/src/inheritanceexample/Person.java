package inheritanceexample;
public class Person {
    private int id;
    String name;
    int age;
    float height;
    Person(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    void doWork(){
        //ekhane kaj korbe 
        //do anything
        System.out.println("Person kaj kore");
    }
}
