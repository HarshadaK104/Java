package Day4.simple;

public class PermanentEmployee extends Employee{
    public float basicSalary;
    float hra;
    float da;

    void calculateSalary(){
        hra = basicSalary * 0.12f;
        da = basicSalary * 0.10f;
        salary = hra+da+basicSalary;
    }

    void display(){
        super.display(); //super is nearest parent class's this keyword (object of parent class)
        //super. is like parent ka this. keyword
        //super() call will call the contructor of parent  
        System.out.println("Basic salary: "+basicSalary);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
    }
}
