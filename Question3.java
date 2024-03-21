package guvitask01;

public class Question3 {

	public static void main(String[] args) {
		int number = 876, reverser = 0;
		while(number!=0) {
			int remainder = number%10;
			reverser = reverser*10+remainder;
			number = number/10;
		}
		System.out.println("The reverse the given number is:"+reverser);
	}

}
