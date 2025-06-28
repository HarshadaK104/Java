package Day4.simple;
//we use inheritance when we classify by types
public class Employee {
    public int id;
    public String name;
    public float salary;

    void display(){
        System.out.println("Id: "+id);
        System.out.println("name: "+name);
        System.out.println("Salary: "+salary);

    }

    void calculateSalary(){} //ploymorphism

}

