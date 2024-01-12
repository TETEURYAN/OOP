package managment;

public class Student {

    private int id;
    private java.lang.String name;
    private int ano;
    private int feesPaid;
    private int feesTotal;


    public Student(int id, java.lang.String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.ano=grade;

    }

    public void setAno(int value){
        this.ano=value;
    }

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getAno() {
        return ano;
    }

    public int getFeesPaid() {
        return feesPaid;
    }


    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }


    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}