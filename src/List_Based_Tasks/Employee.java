package List_Based_Tasks;


public class Employee {
    private int id;
    private String name;
    private String department;
    private String jobTitle;
    private int age;
    private int yearsOfExperience;
    private double salary;
    private int performanceRating;
    private String jobtype;

    public Employee(int id, String name, String department, String jobTitle, int age, int yearsOfExperience, double salary, int performanceRating, String jobtype) {
        this.id=id;
        this.name = name;
        this.department = department;
        this.jobTitle = jobTitle;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        this.performanceRating = performanceRating;
        this.jobtype=jobtype;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public String getJobtype(){
        return jobtype;

    }
    @Override
    public String toString(){
        return  name + " | " + jobTitle + " | Salary: " + salary  + " | Department:" + department+" | YOE:"+yearsOfExperience;
    }
}
