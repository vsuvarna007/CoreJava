package CoreXJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductRating {

	String cname;
	int quantity,price,salary;
	double perc=0;

	public void accept()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name");
			cname = br.readLine();
			System.out.println("Enter Salary");
			salary = Integer.parseInt(br.readLine());
			System.out.println("Enter Price");
			price = Integer.parseInt(br.readLine());
			System.out.println("Enter Quantity");
			quantity = Integer.parseInt(br.readLine());
		}
		catch(IOException ioe)
		{
			System.out.println("Some exception in accept");
		}
	}
	
	public void check()
	{
		if(salary==1000)
		{
			perc = salary/(price*quantity);
			System.out.println(perc+"% of Salary is spent by customer in purchases");
		}
		else
			System.out.println("Customer is not applicable for checking");
	}
	
	public static void main(String[] args) {
		ProductRating pr = new ProductRating();
		pr.accept();
		pr.check();

	}

}
