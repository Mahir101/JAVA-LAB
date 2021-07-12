package inheritanceexample;
public class Test {
    public static void main(String args[]){
        Person ob1 = new Person("Sir",35,16.2f);
        //ob1.doWork();
        Teacher ob2 = new Teacher("Sir",32,12.3f,50000,"Lecturer");
        //ob2.showSalary();
        //ob2.showEverything();
        DeptHead ob3 = new DeptHead("Headsir",11,13.5f,20000,"DepartmentHead");
        //ob3.callMeeting();
        ob3.showEvery();
    }
}
