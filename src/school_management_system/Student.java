package school_management_system;

// this class  is responsible for keep tracking the students fees, name, id, grade, fees paid

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * fees for every student is $30000 per year
     * fees paid is initially = 0
     * @param id the id of the student and it should be unique
     * @param name the proper name of the student
     * @param grade the grade where the student he is
     */
    public Student(int id, String name,int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * used to update the student grade
     * @param grade is the new grade for the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * keep adding the fees to fees paid field
     * just add fees to the fees paid
     * ths school is going to receive the funds
     * @param fees is the fees that the student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "the student: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal;
    }
}
