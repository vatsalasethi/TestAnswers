import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

class  EmplyeeVo{
	
	
	int empId;

	String name;
	int annualIncome;
	int incomeTax;
	
	EmplyeeVo(int id, String name, int inc){ 
		
		
		this.empId= id;
		this.name= name;
		this.annualIncome = inc;
	
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(int incomeTax) {
		this.incomeTax = incomeTax;
	}
	
	@Override
	public String toString() {
		return "Name is " + name + "\nEmp ID is " + empId + "\nIncome=" + annualIncome + "\nIncome Tax=" + incomeTax
				+ "";
	}

	@Override
	public int hashCode() {
		return empId;	
	}

	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (((EmployeeVo) obj).empId == this.empId)
			return true;
		return false;
	}

	class EmployeeBo {
		public void calincomeTax(EmployeeVo e) {
			e.incomeTax = e.annualIncome * 0.33;
		}
	}
	
	class EmployeeSort implements Comparator<EmployeeVo> {

		@Override
		public int compare(EmployeeVo p, EmployeeVo q) {
			// TODO Auto-generated method stub
			if (p.incomeTax > q.incomeTax)
				return -1;
			else
				return 1;
			// return 0;
		}
	}
	
} 



public class EmplyeeMain {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		System.out.println("Enter number of employees");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		// int choice;
		// double result = 0.0;
		int empID;
		String empName;
		double annualIncome, incomeTax;
		n = Integer.parseInt(br.readLine());
		EmployeeVo emps[] = new EmployeeVo[n];
		EmployeeBo eb = new EmployeeBo();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter emp id");
			empID = Integer.parseInt(br.readLine());
			System.out.println("Enter emp name");
			empName = br.readLine();
			System.out.println("ENter annual income");
			annualIncome = Double.parseDouble(br.readLine());
			emps[i] = new EmployeeVo(empName, empID, annualIncome, 0.0);
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Employee " + i + " details are:\n" + emps[i]);
			eb.calincomeTax(emps[i]);
		}

		TreeSet<EmployeeVo> ts = new TreeSet(new EmployeeSort());
		for (int i = 0; i < n; i++) {
			ts.add(emps[i]);
		}

		System.out.println();
		System.out.println("Sorted details are ");
		for (EmployeeVo e : ts) {
			System.out.println("Employee " + e.empName + " details are:\n" + e);
			System.out.println();
	}

}}
