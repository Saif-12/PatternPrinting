package HomeWork;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows and column");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		for(int i=1;i<=row;i++)
		{
			int k=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k+=2;
			}
			System.out.println();
	}

}
}

