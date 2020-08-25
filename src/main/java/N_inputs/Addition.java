package N_inputs;
import java.util.Scanner;
public class Addition extends Calculator  {
	void getResult()
	{
		Scanner sc=new Scanner(System.in);
		 int result=0;
		 int n;
		 int i;
		 System.out.println("Enter the number of values you want to add: ");
		n=sc.nextInt();
		 int num[] = new int[n];
	
	System.out.println("Input "+n+" values");
	for(i=0;i<n;i++)
	{
		num[i]=sc.nextInt();
	}
	
	for(i=0;i<n;i++)
	{
		result=result+num[i];
	}
	System.out.println("Addition of all numbers is "+result);

	System.out.println("================================");

}
}
