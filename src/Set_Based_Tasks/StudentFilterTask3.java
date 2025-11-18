package Set_Based_Tasks;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentFilterTask3 {
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



        List<Student> filteredTask3 = students.stream()
                .filter(s -> !(s.getYearsOfEnrollment() <= 3 &&
                        s.getMajor().equals("Mathematics") &&
                        s.getGpa() < 3.0 &&
                        s.getNumberOfIncompleteCourses() > 0))
                .toList();

        double avgGPAAfterFilter = filteredTask3.stream()
                .mapToDouble(Student::getGpa).average().orElse(0);

        double sumGPA = filteredTask3.stream()
                .filter(s -> s.getAge() > 22 && s.getGpa() > avgGPAAfterFilter)
                .mapToDouble(Student::getGpa).sum();

        System.out.println("Sum of GPAs (Filtered): " + sumGPA);

        Map<String, List<Student>> deptGroup = filteredTask3.stream()
                .collect(Collectors.groupingBy(Student::getMajor));

        deptGroup.forEach((dept, list) -> {
            double avg = list.stream().mapToDouble(Student::getGpa).average().orElse(0);
            if (list.size() > 10 && avg > 3.5) {
                double avgAge = list.stream().mapToInt(Student::getAge).average().orElse(0);
                System.out.println("Average age for " + dept + ": " + avgAge);

                int totalYearsAll = students.stream()
                        .mapToInt(Student::getYearsOfEnrollment).sum();

                if (totalYearsAll > 30 && avg < 3.9) {
                    long factorial = 1;
                    for (int i = 1; i <= (int) avgAge; i++) factorial *= i;
                    System.out.println("Factorial of average age: " + factorial);
                }
            }
        });

    }
}
