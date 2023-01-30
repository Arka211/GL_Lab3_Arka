
public class BalancingBrackets {
	
	import java.util.Scanner;
	import java.util.Stack;
	import java.util.scanner;
	import java.util.stack;
	
	static boolean checkingBracketsBalanced(String bracketExpression)
	{
		if(bracketExpression.length()%2!=0)
			return false;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<bracketExpression.length(); i++)
		{
			char readCharacter = bracketExpression.charAt(i);
			if(!"{}[]()".contains(readCharacter + ""))
			{
				return false;
			}
			if(readCharacter =='(' || readCharacter == '[' || readCharacter == '{')
			{
				stack.push(readCharacter);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char popChar = ' ';
			
			switch(readCharacter)
			{
			case '}';
			popChar = stack.pop();
			if(popChar!= '{')
				return false;
			break;
			
			case ')';
			popChar = stack.pop();
			if(popChar!= '(')
				return false;
			break;
			
			case ']';
			popChar = stack.pop();
			if(popChar!= '[')
				return false;
			break;
			}
		}
		
		return(stack.isEmpty());
				
	}
		
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String bracketExpression = scan.next();
		Boolean result;
		result = checkingBracketsBalanced(bracketExpression);
		
		if(result)
			System.out.println("Entered String has Balanced Brackets");
		else
			System.out.println("Entered String does not have Balanced Brackets");

	}
scan.close();
}
