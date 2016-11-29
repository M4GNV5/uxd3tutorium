package basics;

public class Fibonacci
{
	public int calculate(int n)
	{
		//implement recursive fibonacci
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Fibonacci fibo = new Fibonacci();
		
		int num;
		if(args.length == 1)
			num = Integer.parseInt(args[0]);
		else
			num = 7;
		
		System.out.println("Fibonacci[" + num + "] = " + fibo.calculate(num));
	}
}
