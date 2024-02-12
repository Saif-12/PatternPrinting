
package HomeWork;

import java.util.Scanner;

public class MixturePrinting {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows and column");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0) System.out.print(j+" ");
				if(i%2==0) System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}

	}

}
