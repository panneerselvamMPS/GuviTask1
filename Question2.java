package guvitask01;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int num;
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter The Number:");
		num = number.nextInt();
		
		if(num>=0)
		{
			System.out.println("It is the Poitive Number:"+ num);
		}
		else if(num<=0)
		{
			System.out.println("It is the Nagative Number:"+ num);
		}

	}

}
