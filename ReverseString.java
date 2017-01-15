package CoreXJava;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		String original, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to be reversed");
		original = sc.nextLine();
		int length = original.length();
		
		for(int  i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		System.out.println("Reverse is "+reverse);
		if(original.equals(reverse))
			System.out.println("Entered string is an palindrome");
		else
			System.out.println("Entered string is not an palindrome");
		sc.close();
	}

}
