
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.ideas2it.employeecrud.Employee;

/**
 * EmployeeManagement class for Doing Crud Operation
 *
 * @version  2.0 25-02-2021
 * @author  Riyas Ahamed
 */ 
public class EmployeeManagement {
	
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int menuOption = 0;
	int employeeId = 1;
	Map<Integer, Employee> employeeData = new HashMap<Integer, Employee>();
	EmployeeManagement employeeObject = new EmployeeManagement();
		
	while (menuOption != 6) {
	    System.out.println("Enter the Options");
	    System.out.println(" 1.Create a NewEmployee \n 2.update the existing Employee" +
		    " \n 3.show employee details \n 4.Delete the employee data" +
		    " \n 5.showALL \n 6.Exit");
	    menuOption = scanner.nextInt();
			
	    switch(menuOption) {
		
		//creating New Employeedetails	
	        case 1:		
		    employeeData.put(employeeId, new Employee() );
		    employeeObject.addNewDetails(employeeId, employeeData.get(employeeId));
		    System.out.println("your employee Id is " + employeeId);
		    employeeId++;
		    menuOption = 0;
		    break;	
		
		//Updating the existing employee
	        case 2:
		    System.out.println("Enter the employee Id  to update the details" );
                    employeeId = scanner.nextInt();
                    if(employeeData.containsKey(employeeId ) ) {
                        employeeObject.updateDetails(employeeData.get(employeeId) );
                    } else {
                        System.out.println("There is no such Employee Id. Please check the Id ");
                    }
                    menuOption = 0;
                    break;

                //Getting particular employee details
	        case 3:
		    System.out.println("Enter the Employee Id");
                    employeeId = scanner.nextInt();
                    System.out.println(employeeData.get(employeeId));
                    menuOption = 0;
		    break;

                //Deleting Particular Employee Details
	        case 4:
		    System.out.println("Enter the Employee Id");
                    employeeId = scanner.nextInt();
                    employeeData.remove(employeeId);
                    menuOption = 0;
                    break;

                //Getting All Employee details
	        case 5:
		    if (employeeData.isEmpty() ) {
	                System.out.println("No Records found");
	            } else {
	                Iterator<Employee> iterator = employeeData.values().iterator();
	                while (iterator.hasNext()) {
	            	    System.out.println(iterator.next());
	                }	
	            }
		    menuOption = 0;
		    break;

		//Exit
		case 6:
		    System.out.println("Thank you");
		    break;
	    }
        }
			
    }	
    void addNewDetails(int employeeId, Employee employee) {
	employee.setEmployeeId(employeeId);
	System.out.println("Enter First Name");
	employee.setFirstName(scanner.nextLine() );
	System.out.println("Enter Last Name");
	employee.setLastName(scanner.nextLine() );
	System.out.println("Enter Age");
	employee.setAge(scanner.nextInt() );
	System.out.println("Enter Phone number:");
	employee.setMobileNo(scanner.nextLong() );   
    }
		
    void updateDetails(Employee employee) {
	System.out.println("Enter the First Name");
	employee.setFirstName(scanner.next());
	System.out.println("Enter the Last Name");
	employee.setLastName(scanner.next());
	System.out.println("Enter the Age");
	employee.setAge(scanner.nextInt());
	System.out.println("Enter the MobileNo");
	employee.setMobileNo(scanner.nextLong() );    
    }	
}



