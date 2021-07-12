package inheritanceexample;
public class DeptHead extends Teacher {
    DeptHead(String name, int age, float height, int salary, String designation){
        super(name, age,height,salary, designation);       
    }
    void callMeeting(){
        //this calls
        System.out.println("Meeting is called by the Department Head");
    }
    void showEvery(){
        System.out.println("Name of Department Head = " + name );
        System.out.println("Salary of Department Head  = " +salary );
        System.out.println("Age of Department Head  = " +age );
        System.out.println("Height of Department Head  = " +height );
        System.out.println("Designation of Department Head  = " +designation );
        
    }
}
