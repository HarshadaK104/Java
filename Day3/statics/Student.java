package Day3.statics;
//lambok library that gets sets data on its own we use @Data
//this is bean standard

public class Student {
    private int id;
    private String name;
    private float marks;
    public static int count; //static makes the variable common for every object, doesnt reinitiate 
    // static is stored in a different memory (objects in heap, others in stack)
    // static is initiated before object creation, only once

    public Student(){
        count++;
    } // no arg constructor
// we use default parameters when we are not aware of value so a default value can be set
// default is used by java when there are 0 constructors
    public Student(int id, String name, float marks){
        this.id = id; // this will point to current object of the class, can call only its own class not any other class
        this.name = name;
        this.marks = marks;
    }

    public int  getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

void printDetails(){
    System.out.println("id: "+ id);
    System.out.println("name: "+ name);
    System.out.println("marks: "+ marks);

}
public static void getStudentCount(){
    System.out.println(count);

}
}
