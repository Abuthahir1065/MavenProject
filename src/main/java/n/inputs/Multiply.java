package n.inputs;
import java.util.Scanner;
public class Multiply extends Calculator {
	void getResult()
	{
		Scanner sc=new Scanner(System.in);
	    int result=1;
		 int n;
		 int i;
		 int num[] = new int[100];
	System.out.println("Enter the number of values you want to multiply: ");
	n=sc.nextInt();
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
    sc.close();
}

}
