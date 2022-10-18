package school_management_system;

/**
 * ths class is responsible for keeping track
 * of the teacher's id, name, salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * create new teacher objects
     * @param id the id of the teacher
     * @param name name of the teacher
     * @param salary the salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.salary = salary;
        this.id = id;
        this.name = name;
        this.salaryEarned = 0;
    }

    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "The teacher: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryEarned=" + salaryEarned;
    }
}
