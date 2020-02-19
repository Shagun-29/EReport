import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Models.Employee;

public class EReport {

	private static BufferedReader in;
	private static ArrayList<Employee> employees = new ArrayList<Employee>();

	public static void main(String[] args) throws IOException {
		
		String path = "./employees.dat";
		FileInputStream fis = new FileInputStream(path);
		in = new BufferedReader(new InputStreamReader(fis));
		String s = null;
		while ((s = in.readLine())!=null)
	    {
			if(s.trim().charAt(0) != '#') {
				try {
					String emp[] = s.split(",");
					String empName[] = emp[1].trim().split(" ");
					int id = Integer.parseInt(emp[0]);
					String fname = empName[0];
					String lname = empName[1];
					Employee employee = new Employee(id, fname, lname);
					employees.add(employee);
				} catch(Exception e) {
					System.out.println("Error in parsing employee data...");
					e.printStackTrace();
				}
				
			}
	    }
		
		//Sorting By Employee ID
		System.out.println("Processing by employee number...");
		printEmployees(sortByID(employees));
				
		System.out.println();
		//Sorting by last name
		System.out.println("Processing by last (family) Name...");
		printEmployees(sortByLastName(employees));
		
	}

	/*
	 * Function prints all the elements in the Arraylist
	 * @param employees
	 */
	protected static void printEmployees(ArrayList<Employee> employees){
		for(Employee emp : employees) {
			System.out.println(emp.getID() + "," + emp.getFirstName() + " " + emp.getLastName());
		}
	}
	
	/**
	 * Used array sort function to sort Employees 
	 * by employee ID
	 * @param arr
	 * @return
	 */
	protected static ArrayList<Employee> sortByID(ArrayList<Employee> arr){
		arr.sort((Employee e1, Employee e2) -> {
		   if (e1.getID() > e2.getID())
			     return 1;
			   if (e1.getID() < e2.getID())
			     return -1;
			   return 0;
			});
		return arr;
	}

	/**
	 * Used Collections sort method to sort Employees
	 * by lastName(String) 
	 * @param arr
	 * @return
	 */
	protected static ArrayList<Employee> sortByLastName(ArrayList<Employee> arr){
		Collections.sort(arr, new Comparator<Employee>() {  
			@Override
			public int compare(Employee e1, Employee e2) { 
		        return e1.getLastName().compareTo(e2.getLastName());
			}  
		});  
		return arr;
	}
}
