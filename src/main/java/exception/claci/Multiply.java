package exception.claci;
import java.util.Scanner;
public class Multiply extends Calculator {
	void getResult()
	{
		Scanner sc=new Scanner(System.in);
	    int result=1;
		 int n;
		 int i;
		 System.out.println("Enter the number of values you want to multiply: ");
			n=sc.nextInt();
		 int num[] = new int[n];
	try
	{
	System.out.println("Input "+n+" values");
	for(i=0;i<n;i++)
	{
		num[i]=sc.nextInt();
	}
	
	for(i=0;i<n;i++)
	{
		result=result*num[i];
	}
	System.out.println("Multiplication of all numbers is "+result);

	System.out.println("================================");
	}
	catch(Exception e)
	{
		System.out.println("InputMismatchException Occured");
		System.out.println(e);
		
	}
    sc.close();
}

}
