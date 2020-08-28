package n.inputs;
import java.util.Scanner;

public class Evaluation {

	static boolean isOperand(char character)
	{
		return (character>='0' && character<='9');
	}
	static int value(char character)
	{
		return (int)(character-'0');
	}
	static int evaluate(String expression)
	{
		if(expression.length()==0)
		   return -1;
		int result=value(expression.charAt(0));
		for(int i=1;i<expression.length();i+=2)
		{
			char operator=expression.charAt(i);
			char operand=expression.charAt(i+1);
			if(isOperand(operand)==false)
				return -1;
			if(operator=='+')
				result=result+value(operand);
			else if(operator=='-')
					result=result-value(operand);
			else if(operator=='*')
				result=result*value(operand);
			else if(operator=='/')
				result=result/value(operand);
			else 
				return -1;
		}
		return result;
		}
	

void getResult()
{
	Scanner input=new Scanner(System.in);
	System.out.println("Input your Expression");
	String expression2=input.next();
	int result=evaluate(expression2);
	if(result==-1)
	{
		System.out.println("Expression Invalid");
	}
	else
	{
		System.out.println("Value of the expression is "+result);
		System.out.println("========================================");
	}
	
	input.close();

}
}
