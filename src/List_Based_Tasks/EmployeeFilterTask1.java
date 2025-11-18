package List_Based_Tasks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeFilterTask1 {
    public static void main(String[] args){
        List<Employee> emp = List.of(
                new Employee(1,"Krishna", "IT", "Manager", 28, 4, 150000, 4,"Full-time"),
                new Employee(12,"Kitti", "Software", "Developer", 22, 3, 46700, 3,"full-tim"),
                new Employee(20,"Chandu", "Engineer", "Telecommunication", 21, 2, 65000, 5,"Full-time"),
                new Employee(44,"Lalith", "IT", "Manager", 24, 1, 90000, 4,"Full-time")
        );

        List<String> res=emp.stream().filter(e->e.getJobTitle().equalsIgnoreCase("Manager"))
                .filter(e->e.getSalary()>50000)
                .filter(e->e.getYearsOfExperience()<=3)

                .sorted(Comparator.comparing(Employee::getYearsOfExperience).reversed()
                        .thenComparing(Employee::getPerformanceRating))

                .map(e -> new StringBuilder(e.getName()).reverse().toString().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
