package Day9.serialization;
//lambok library that gets sets data on its own we use @Data
//this is bean standard

import java.io.Serializable;

public class Student implements Serializable {//serializable is marker interface
    private int id;
    private String name;
    private float marks;

    public Student(){} // no arg constructor
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


}
