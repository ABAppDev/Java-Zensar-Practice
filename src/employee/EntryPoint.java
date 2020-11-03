package employee;

public class EntryPoint {

    
    public static void main(String[] args) 
	{
		AreaSalesManager a1 = new AreaSalesManager();
		a1.display1();
		System.out.println("Employee Yearly salary is : "+a1.calSal1());
		a1.display2();
		System.out.println("Managers basic salary is : "+a1.manSal);
		System.out.println("Managers salary + Bonus is : "+a1.calSal2());
		a1.display3();
		System.out.println("AreaSalesManager salary with other Allowance is : "+a1.calSal3());
		
	}
    
}
