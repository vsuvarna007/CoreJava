package CoreXJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentRating {

	
	String sname;
	int marks1,marks2,marks3,marks4,marks5;
	double perc=0;
	int total=0;
	
	public void accept()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a Student's Name");
			sname = br.readLine();
			System.out.println("Enter marks for all 5 subjects");
			marks1 = Integer.parseInt(br.readLine());
			marks2 = Integer.parseInt(br.readLine());
			marks3 = Integer.parseInt(br.readLine());
			marks4 = Integer.parseInt(br.readLine());
			marks5 = Integer.parseInt(br.readLine());
		}
		catch(IOException ioe)
		{
			System.out.println("Some exception in accept");
		}
	}
	
	public void grader()
	{
		total = marks1+marks2+marks3+marks4+marks5;
		
		perc = (total/500)*100;
		
		if(perc>=85 && perc<=100)
			System.out.println("Student received 'Grade A'"+perc+" "+total);
		else if(perc>=75 && perc<=84)
			System.out.println("Student received 'Grade B'"+perc+" "+total);
		else if(perc>=65 && perc<=74)
			System.out.println("Student received 'Grade C'"+perc+" "+total);
		else if(perc>=50 && perc<=64)
			System.out.println("Student received 'Grade D'"+perc+" "+total);
		else
			System.out.println("Student received 'Fail'"+perc+" "+total);
	}
	public static void main(String[] args) {
		
		StudentRating sr = new StudentRating();
		sr.accept();
		sr.grader();

	}

}
