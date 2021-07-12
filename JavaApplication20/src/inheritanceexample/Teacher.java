package inheritanceexample;
public class Teacher extends Person {
    float salary;
    String designation;
    Teacher(String name, int age, float height, int salary, String designation){
        super(name, age, height);
        this.name = name;
        this.age = age;
        this.height = height;
        this.salary = salary;
        this.designation=designation;
    }
    void showSalary(){
        //show salary
        System.out.println("Salary of teacher = " + salary );
    }
    void showEverything(){
        System.out.println("Name of teacher = " + name );
        System.out.println("Salary of teacher = " +salary );
        System.out.println("Age of teacher = " +age );
        System.out.println("Height of teacher = " +height );
        System.out.println("Designation of teacher = " +designation );
        
    }
}
