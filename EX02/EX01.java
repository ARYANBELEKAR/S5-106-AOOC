public class EmployeeTest {

    static class Employee {

        private String firstName;
        private String lastName;
        private double monthlySalary;

        // Constructor
        public Employee(String firstName, String lastName, double monthlySalary) {
            this.firstName = firstName;
            this.lastName = lastName;

            if (monthlySalary > 0)
                this.monthlySalary = monthlySalary;
            else
                this.monthlySalary = 0.0;
        }

        // Setters
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setMonthlySalary(double monthlySalary) {
            if (monthlySalary > 0)
                this.monthlySalary = monthlySalary;
            else
                this.monthlySalary = 0.0;
        }

        // Getters
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getMonthlySalary() {
            return monthlySalary;
        }

        // Yearly Salary
        public double getYearlySalary() {
            return monthlySalary * 12;
        }
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Sneha", "Patil", 20000);
        Employee emp2 = new Employee("Rahul", "Sharma", 25000);

        // Display yearly salary
        System.out.println(emp1.getFirstName() + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " Yearly Salary: " + emp2.getYearlySalary());

        // 10% raise
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.println("\nAfter 10% Raise:");

        System.out.println(emp1.getFirstName() + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " Yearly Salary: " + emp2.getYearlySalary());
    }
}