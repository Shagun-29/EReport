import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
		
		for(Employee emp : employees) {
			System.out.println(emp.getID() + "," + emp.getFirstName() + " " + emp.getLastName());
		}
	}

}
