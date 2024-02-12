package HomeWork;

import java.util.Scanner;

public class Assigment3 {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows and column");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		
	}

}
}
