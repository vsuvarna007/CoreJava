package CoreXJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindString {
	int size;
	String checker[];
	String querry[];
	
	public void accept()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String user = br.readLine();
			checker = user.split("");
			size = checker.length;
		}
		catch(IOException ioe)
		{
			System.out.println("some exception in accept");
		}
	}
	
	public void checker()
	{
		String str = "hello";
		querry = str.split("");
		int count = 0;
		try
		{
			for(int i=0;i<size;i++)
			{
				switch(checker[i])
				{
					case "h":
						count++;
						break;
					case "e":
						count++;
						break;
					case "l":
						count++;
						break;
					case "o":
						count++;
						break;
					default:
						break;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Check Array Size");
		}
		finally
		{
			if(count!=0 && count > 4)
				System.out.println("The string entered by user has 'h' 'e' 'l' 'l' 'o' hidden "+count);
			else
				System.out.println("The string entered by user does noy have 'h' 'e' 'l' 'l' 'o' hidden " +count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindString fs = new FindString();
		fs.accept();
		fs.checker();
	}

}
