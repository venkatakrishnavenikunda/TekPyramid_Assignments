package List_Based_Tasks;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilterTask2 {
    public static void main(String[] args){
        List<Employee> emp = List.of(
                new Employee(13,"Krishna", "IT", "Manager", 28, 6, 150000, 8,"Full-time"),
                new Employee(10,"Kitti", "Software", "Developer", 22, 3, 46700, 9,"Full-time"),
                new Employee(33,"Chandu", "Engineer", "Telecommunication", 21, 2, 65000, 5,"Full-time"),
                new Employee(40,"Lalith", "IT", "Manager", 24, 1, 90000, 4,"Full-time")
        );

        List<Integer>res= emp
                .stream().filter(e->e.getYearsOfExperience()<=5)
                .filter(e->e.getPerformanceRating()<8)
                .filter(e->e.getSalary()>=60000 && e.getSalary()<=120000)

                .sorted(
                        Comparator.comparing(Employee::getSalary)
                                .thenComparing(Comparator.comparing(Employee::getYearsOfExperience).reversed())
                )

                .map(e->e.getId()*10)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
