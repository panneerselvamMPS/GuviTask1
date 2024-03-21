package guvitask01;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        n=sc.nextInt();

        for (int i = n; i >= 1; i--) {
            int temp = n;
            for (int j = n; j >= 1; j--) {
                if (j > i) {
                    System.out.print(temp);
                } else {
                    System.out.print(j);
                }
                temp--;
            }
            System.out.println();
        }
    }
}


	