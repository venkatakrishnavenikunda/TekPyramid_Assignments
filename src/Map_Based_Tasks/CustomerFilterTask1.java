package Map_Based_Tasks;

import java.util.*;

public class CustomerFilterTask1 {
    public static void main(String[] args){
        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put("C1", new Customer("C1", "Alice", "India", 25, 5, 15000, 7, 20));
        customerMap.put("C2", new Customer("C2", "Bob", "USA", 30, 3, 10000, 4, 15));
        customerMap.put("C3", new Customer("C3", "David", "UK", 45, 10, 20000, 8, 30));
        customerMap.put("C4", new Customer("C4", "John", "India", 28, 2, 3000, 3, 22));
        customerMap.put("C5", new Customer("C5", "Emma", "India", 34, 4, 4000, 2, 18));
        customerMap.put("C6", new Customer("C6", "Sophia", "India", 26, 1, 2500, 3, 10));
        customerMap.put("C7", new Customer("C7", "Lily", "India", 32, 8, 7000, 6, 50));
        customerMap.put("C8", new Customer("C8", "Mark", "India", 29, 7, 9000, 7, 40));
        customerMap.put("C9", new Customer("C9", "Chris", "India", 27, 6, 11000, 9, 35));
        customerMap.put("C10", new Customer("C10", "Jenny", "India", 33, 9, 13000, 4, 60));
        customerMap.put("C11", new Customer("C11", "Zara", "India", 31, 5, 12500, 9, 70));


        OptionalDouble average = customerMap.values().stream()
                .mapToDouble(Customer::getBalance).average();

        //  Extract the actual value
        double avg = average.orElse(0);

        // Filter customers with balance >= average
        List<Customer> filtered = customerMap.values().stream()
                .filter(c -> c.getBalance() >= avg)
                .toList();

        // Calculate total years of membership
        int totalYears = filtered.stream()
                .mapToInt(Customer::getYearsOfMembership)
                .sum();

// Find customer with highest years of membership
        Customer highestMembership = filtered.stream()
                .max(Comparator.comparingInt(Customer::getYearsOfMembership))
                .orElse(null);
        System.out.println("The Average balance of all customers: "+avg);
        System.out.println("The filtered:" +filtered);
        System.out.println("total years of membership : "+totalYears);
        System.out.println("customer with highest years of membership: "+highestMembership);
    }
}
