package List_Based_Tasks;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilterTask3 {
    public static void main(String[] args) {

        // Input employees
        List<Employee> emp = List.of(
                new Employee(13, "Krishna", "IT", "Manager", 28, 6, 150000, 8, "Full-Time"),
                new Employee(10, "Kitti", "Software", "Developer", 22, 3, 46700, 9, "Part-Time"),
                new Employee(33, "Chandu", "Engineer", "Telecommunication", 21, 2, 65000, 5, "Full-Time"),
                new Employee(40, "Lalith", "Marketing", "Manager", 24, 1, 40000, 4, "Part-Time"),
                new Employee(50, "Sneha", "Sales", "Executive", 26, 4, 55000, 7, "Full-Time")
        );

        //1. Remove all part-time, salary < 50,000 in Sales/Marketing
        List<Employee>res= emp.stream()
                .filter(e->!(e.getJobtype().equalsIgnoreCase("part-time") &&
                        e.getSalary()<50000 &&
                        (e.getDepartment().equalsIgnoreCase("Sales") ||
                                e.getDepartment().equalsIgnoreCase("Marketing"))))
                .collect(Collectors.toList());

        //2. Sum salaries of remaining employees with >3 years experience
        double sala= res.stream()
                .filter(e->e.getYearsOfExperience()>3)
                .mapToDouble(Employee::getSalary)
                .sum();
//3.Average age of remaining employees with performance rating >= 7
        double avg=res.stream()
                .filter(e->e.getPerformanceRating()>=7)
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0);
        System.out.println("Filtered employees"+res);
        System.out.println("Sum of slaries:"+sala);
        System.out.println("Average age:"+avg);
    }
}
