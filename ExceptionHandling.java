package CoreXJava;

public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int a = 20/0;
			System.out.println("Answer = "+a);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Cannot Divide by zero");
		}
		finally
		{
			System.out.println("No one can stop me!");
		}
	}

}
