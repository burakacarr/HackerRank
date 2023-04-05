import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    private static final double EPSILON = 0.001;

    @Override
    public int compare(Student s1, Student s2) {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > EPSILON) {
            return Double.compare(s2.getCgpa(), s1.getCgpa()); // descending order
        } else if (!s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName());
        } else {
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
}

public class JavaSort{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int id = scan.nextInt();
            String name = scan.next();
            double cgpa = scan.nextDouble();
            studentList.add(new Student(id, name, cgpa));
        }
        scan.close();

        Collections.sort(studentList, new StudentComparator());
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }
}

