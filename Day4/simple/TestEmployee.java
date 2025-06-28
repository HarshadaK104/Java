package Day4.simple;

public class TestEmployee {
    public static void main(String[] args) {
        PermanentEmployee emp1= new PermanentEmployee();
        emp1.id = 101;
        emp1.name = "ncjfnew";
        emp1.basicSalary = 10000f;
        emp1.calculateSalary(); //child method is called bcoz it is available locally
        emp1.display();
    }
}
// when we make a constructor,a parent constructor is executed before child constructor