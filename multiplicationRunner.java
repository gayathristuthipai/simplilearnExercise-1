package fullStackJavaCourse;

import java.util.Scanner;

public class multiplicationRunner
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number to get it's multiplication table: ");
		int a= obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d * %d = %d", a,i,a*i).println();
		}
		
	}

}
