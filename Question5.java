package guvitask01;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		float purchased,discount,finalpay;
		Scanner shop = new Scanner(System.in);
		System.out.println("Enter The Purchase Amount:");
		purchased = shop.nextFloat();
		if(purchased<=500)
		{
			System.out.println("No Discount is Applied");
		}
		else if(purchased>=500&&purchased<=1500)
		{
			discount = (purchased*10)/100;
			finalpay = purchased - discount;
		}
		else if(purchased>=1000)
		{
			discount = (purchased*20)/200;
			finalpay = purchased - discount;
		}
		else
		{
			System.out.println("The Total Amount is:"+finalpay);
		}
	}

}
