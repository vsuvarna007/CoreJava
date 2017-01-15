package CoreXJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	
	static String name;
	static int age, pre_age, count=0;
	
	public static void accept()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Name");
				name = br.readLine();
				System.out.println("Enter Age");
				age = Integer.parseInt(br.readLine());
				if(count!=0)
				{
					if(age>pre_age)
					{
						System.out.println("This person is elder");
						pre_age=age;
					}
				}
				count++;
			}
			catch(Exception e)
			{
				System.out.println("some exception in accept");
			}
		}
		
	}

	public static void main(String[] args) {
		accept();

	}

}
