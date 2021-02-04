package EmployeeApp;

public class EmployeeApp {
	static Validation validation = new Validation();
	static Employee employees[] = {};

	public static void main(String args[]) {

		do {
			System.out.println(
					"Enter 1 to add employee deatils\nEnter 2 to display employee details\nEnter 3 to sort employee by salary\nEnter 4 delete employee");
			int in = validation.ValidateIntegerInput();
			switch (in) {
			case 1:
				System.out.println("Enter id");
				int id = validation.ValidateIntegerInput();
				System.out.println("Enter name");
				String name = validation.ValidateStringInputAfterInterInput();
				System.out.println("Enter designation");
				String designation = validation.ValidateStringInput();
				System.out.println("Enter salary");
				long salary = validation.ValidateLongInput();

				employees = addEmployee(id, name, designation, salary);

				break;
			case 2:
//				for (int j = 0; j < employees.length; j++) {
//					if (employees[j] != null)
//						System.out.println(
//								"id " + employees[j].getId() + "\name " + employees[j].getName() + "\ndesignation "
//										+ employees[j].getDesignationString() + "\nsalary " + employees[j].getSalary());
//				}
				System.out.println("Enter name");
				String name_ = validation.ValidateStringInputAfterInterInput();
				searchEmployee(name_);
				break;
			case 3:
//				based_on_salary();
				based_on_salary_insertion();
				break;
			case 4:
				System.out.println("Enter the first id");
				int emp_id = validation.ValidateIntegerInput();
				deleteEmployee(emp_id);

				break;
			default:
				System.out.println("Invalid Input");
				break;

			}
		} while (true);

	}

	private static Employee[] addEmployee(int id, String name, String designation, long salary) {
		Employee employee[] = new Employee[employees.length + 1];
		for (int i = 0; i < employees.length; i++)
			employee[i] = employees[i];
		employee[employees.length] = new Employee(id, name, designation, salary);
		return employee;

	}

	public static void based_on_salary() {
		for (int i = 1; i < employees.length; i++) {
			for (int j = 0; j < employees.length - i; j++) {

				if (employees[j].getSalary() > employees[i].getSalary()) {
					Employee temp = employees[j];
					employees[j] = employees[j + 1];
					employees[j + 1] = temp;

				}

			}
		}

		for (int i = 0; i < employees.length; i++)
			if (employees[i].getSalary() > 1000)
				System.out.println(
						"ID : " + employees[i].getName() + "\nname : " + employees[i].getName() + "\ndesignation : "
								+ employees[i].getDesignationString() + "\nsalary : " + employees[i].getSalary());

	}

	public static void based_on_salary_insertion() {

		for(int i=1;i<employees.length;i++) {
			long key = employees[i].getSalary();
			int j = i -1;
			while(j >=0 && employees[j].getSalary() > key) {
				employees[j +1].setSalary(employees[j].getSalary());
				j--;
				
			}
			employees[j+1].setSalary(key);
			
			
		}
		for (int i = 0; i < employees.length; i++)
			if (employees[i].getSalary() > 1000)
				System.out.println(
						"ID : " + employees[i].getId() + "\nname : " + employees[i].getName() + "\ndesignation : "
								+ employees[i].getDesignationString() + "\nsalary : " + employees[i].getSalary());

	}

	public static void deleteEmployee(int id) {

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && (employees[i].getId() == id)) {
				employees[i] = null;
				break;
			}

			if (i == employees.length - 1) {
				System.out.println("employee not present");
			}
		}
	}

	private static void searchEmployee(String name) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null) {
				if (employees[i].getName().equals(name)) {
					System.out.println("id :" + employees[i].getId());
					System.out.println("Name :" + employees[i].getName());
					System.out.println("Designation :" + employees[i].getDesignationString());
					System.out.println("Salary :" + employees[i].getSalary());
				}
			}
		}
	}

}
