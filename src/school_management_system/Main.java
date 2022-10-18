package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher younes = new Teacher(1, "younes", 3000);
        Teacher john = new Teacher(2, "john", 2000);
        Teacher ilyes = new Teacher(3, "ilyes", 4500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(younes);
        teacherList.add(john);
        teacherList.add(ilyes);

        Student marcos = new Student(1, "marco", 4);
        Student brahim = new Student(2,"brahim", 5);
        Student malik = new Student(3, "malik bien", 2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(marcos);
        studentList.add(brahim);
        studentList.add(malik);

        School cyrax = new School(teacherList, studentList);

        marcos.payFees(10000);
        brahim.payFees(9000);
        malik.payFees(8500);
        System.out.println("cyrax school has earned: $" + cyrax.getTotalMoneyEarned());
        System.out.println("------------- MAKING CYRAX SCHOOL PAY SALARY -------------");
        younes.receiveSalary(younes.getSalary());
        System.out.println("Cyrax School has spent for salaries to " + younes.getName() + " and now has " +
                cyrax.getTotalMoneyEarned());

        john.receiveSalary(john.getSalary());

        System.out.println("Cyrax School has spent for salaries to " + younes.getName() + " and now has " +
                cyrax.getTotalMoneyEarned());
        System.out.println(younes);
    }
}
