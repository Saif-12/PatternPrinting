package HomeWork;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows and column");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
