package managment;
import java.util.*;
public class Teacher {

    private int id;
    private java.lang.String name;
    private int salary;
    private int salaryEarned;


    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id of the teacher.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher.
     */
    public String getName(){
        return name;
    }



    public int getSalary(){
        return  salary;
    }


    public void setSalary(int salary){
        this.salary=salary;
    }

    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public java.lang.String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}