
public class Driver {
	
	  public static void printInfo(Employee employee) {
	    	
	        System.out.println("First Name: " + employee.getFirstName());
	        System.out.println("Last Name: " + employee.getLastName());
	        System.out.println("Social Security Number: " + employee.getSSNumber());

	        if (employee instanceof SalariedEmployee) {
	        	
	            System.out.println("Weekly Salary: $" + ((SalariedEmployee) employee).getWeeklySalary());
	            
	        } else if (employee instanceof HourlyEmployee) {
	        	
	            HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;
	            System.out.println("Wage: $" + hourlyEmployee.getWage());
	            System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
	            
	        } else if (employee instanceof CommissionEmployee) {
	        	
	            CommissionEmployee commissionEmployee = (CommissionEmployee) employee;
	            System.out.println("Commission Rate: " + commissionEmployee.getCommissionRate() + "%");
	            System.out.println("Gross Sales: $" + commissionEmployee.getGrossSales());
	            
	        } else if (employee instanceof BaseEmployee) {
	        	
	            System.out.println("Base Salary: $" + ((BaseEmployee) employee).getBaseSalary());
	            
	        }

	        System.out.println(); 
		}
	  
	public static void main(String[] args) {
		
        SalariedEmployee emp1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee emp2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee emp3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee emp4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee emp5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee emp6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee emp7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        printInfo(emp1);
        printInfo(emp2);
        printInfo(emp3);
        printInfo(emp4);
        printInfo(emp5);
        printInfo(emp6);
        printInfo(emp7);
    }

 
}
