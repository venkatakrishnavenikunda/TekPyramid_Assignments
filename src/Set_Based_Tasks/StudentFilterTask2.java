package Set_Based_Tasks;

import java.util.*;

public class StudentFilterTask2 {
    public static void main(String[] args){
        Set<Student> students = new HashSet<>();

        students.add(new Student("Balu", "Computer Science", 28, 2, 3.8, 0));
        students.add(new Student("savi", "Biology", 25, 3, 3.4, 1));
        students.add(new Student("Kitti", "Engineering", 21, 4, 3.6, 0));
        students.add(new Student("Chandu", "Chemistry", 20, 5, 2.9, 2));
        students.add(new Student("Lucky", "Mathematics", 12, 1, 2.7, 3));
        students.add(new Student("Satya", "Mathematics", 24, 4, 3.2, 0));
        students.add(new Student("Honey", "Computer Science", 25, 5, 3.9, 0));
        students.add(new Student("Krishna", "Engineering", 21, 7, 3.7, 0));
        students.add(new Student("Mahesh", "Biology", 20, 2, 3.1, 0));
        students.add(new Student("Tarak", "Mathematics", 23, 3, 2.8, 3));
        students.add(new Student("Nanda", "Mathematics", 26, 6, 2.5, 5));
        students.add(new Student("Aarshi", "Mathematics", 22, 2, 2.9, 2));
        students.add(new Student("Suhani", "Mathematics", 21, 3, 3.6, 0));
        students.add(new Student("Bittu", "Mathematics", 24, 4, 3.7, 0));
        students.add(new Student("Lalith", "Mathematics", 22, 2, 3.5, 1));



        double avgGPAAll = students.stream().mapToDouble(Student::getGpa).average().orElse(0);

        List<Student> filteredTask2 = students.stream()
                .filter(s -> !(s.getGpa() < avgGPAAll &&
                        s.getAge() > 18 &&
                        (s.getMajor().equals("Biology") || s.getMajor().equals("Chemistry"))))
                .toList();

        int totalYears = filteredTask2.stream()
                .filter(s -> s.getYearsOfEnrollment() <= 4 &&
                        (s.getMajor().equals("Computer Science") || s.getMajor().equals("Engineering")))
                .mapToInt(Student::getYearsOfEnrollment)
                .sum();

        System.out.println("Total years of enrollment (CS & Engg only): " + totalYears);

        Optional<Student> highestYears = filteredTask2.stream()
                .filter(s -> s.getAge() < 30 && s.getGpa() > 3.7)
                .max(Comparator.comparingInt(Student::getYearsOfEnrollment));

        System.out.println("Student with highest enrollment: " +
                highestYears.orElse(null));

    }
}
