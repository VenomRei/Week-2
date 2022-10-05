package week2;
import java.lang.Math;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		int [][] salary = new int[4][3];
		double [][] grosssalary = new double[4][3];
		
		for (int i = 0; i < salary.length; i++)
		{
			
			for (int j= 0; j < salary[i].length; j++)
			{
				salary[i][j] = (int)(Math.random()*1000);
				System.out.print(salary[i][j] + " " );
				grosssalary[i][j] = (salary[i][j]) + (salary[i][j]*0.10);
				System.out.print(grosssalary[i][j] + " " );
			}
			System.out.println();
			System.out.println();
		}
	
	}
	
}
