package CoreXJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class AverageProductRating {

	String cname;
	int rating, count=0;
	int i;
	LinkedList<Integer> ll = new LinkedList<>();
	
	public void accept()
	{
		try
		{
			for(i=0;i<=5;i++)
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Customer Name");
				cname = br.readLine();
				count++;
				System.out.println("Enter a Rating for Android");
				ll.add(Integer.parseInt(br.readLine()));
			}
		}
		catch(IOException ioe)
		{
			System.out.println("Some exception in accept");
		}
	}
	
	public void checker()
	{
		try
		{
			int check[]=new int[5];
			for(int i=0;i<5;i++)
				check[i] = ll.get(i);
			int length = check.length;
			double avg = 0, preval =0;
			for(int j=0;j<length;j++)
				preval+=check[j];
			avg=preval/count;
			System.out.println("Average is = "+ avg);
		}
		catch(Exception e)
		{
			System.out.println("Some exception in checker");
		}
	}
	
	public static void main(String[] args) {
		AverageProductRating apr = new AverageProductRating();
		apr.accept();
		apr.checker();
	}

}
