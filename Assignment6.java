package HomeWork;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows and column");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int k = 1;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j<=i; j++) {
				if((i+j)%2==0)
				{
					System.out.print(1+" ");
				}
				else System.out.print(0+" ");
					
				
			}
			System.out.println();
		}

	}
}
