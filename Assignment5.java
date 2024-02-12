package HomeWork;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of rows and column");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int k=1;
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
	}

}
}
