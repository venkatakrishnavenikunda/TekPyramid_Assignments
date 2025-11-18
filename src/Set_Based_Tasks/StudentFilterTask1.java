package Set_Based_Tasks;

import java.util.*;
import java.util.stream.Collectors;

public class StudentFilterTask1 {
    public static void main(String[] args){
        Set<Student> s = new HashSet<>();

        s.add(new Student("Balu", "Computer Science", 28, 2, 3.8, 0));
        s.add(new Student("savi", "Biology", 25, 3, 3.4, 1));
        s.add(new Student("Kitti", "Engineering", 21, 4, 3.6, 0));
        s.add(new Student("Chandu", "Chemistry", 20, 5, 2.9, 2));
        s.add(new Student("Lucky", "Mathematics", 12, 1, 2.7, 3));
        s.add(new Student("Satya", "Mathematics", 24, 4, 3.2, 0));
        s.add(new Student("Honey", "Computer Science", 25, 5, 3.9, 0));
        s.add(new Student("Krishna", "Engineering", 21, 7, 3.7, 0));
        s.add(new Student("Mahesh", "Biology", 20, 2, 3.1, 0));
        s.add(new Student("Tarak", "Mathematics", 23, 3, 2.8, 3));
        s.add(new Student("Nanda", "Mathematics", 26, 6, 2.5, 5));
        s.add(new Student("Aarshi", "Mathematics", 22, 2, 2.9, 2));
        s.add(new Student("Suhani", "Mathematics", 21, 3, 3.6, 0));
        s.add(new Student("Bittu", "Mathematics", 24, 4, 3.7, 0));
        s.add(new Student("Lalith", "Mathematics", 22, 2, 3.5, 1));


        //1. Group students by major into a Set<Student>
        Map<String, Set<Student>> group = s.stream()
                .collect(Collectors.groupingBy(
                        Student::getMajor,
                        Collectors.toSet()
                ));

// 2. Filter the map: keep only majors with >5 students & avg GPA >3.0
        Map<String, Set<Student>> result = group.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 5)
                .filter(entry -> entry.getValue().stream().mapToDouble(Student::getGpa).average().orElse(0) > 3.0)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));


        // 3. Sort students inside each major in ascending order of GPA and descending order of age
        Map<String, List<Student>> sortedResult = result.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .sorted(
                                        Comparator.comparingDouble(Student::getGpa)
                                                .thenComparing(Comparator.comparingInt(Student::getAge).reversed())
                                )
                                .collect(Collectors.toList())
                ));

// Print the sortedResult map, which contains grouped + sorted students
        sortedResult.forEach((major, studentsInMajor) -> {
            System.out.println("Major: " + major);
            studentsInMajor.forEach(student -> System.out.println("  " + student));
        });

    }
}
