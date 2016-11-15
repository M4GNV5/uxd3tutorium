package euler;

import java.io.IOException;

public class DigitSum
{
	public static void main(String[] args)
	{
		long sum = 0;
		
		try
		{
			int val = System.in.read();
			while(val >= '0' && val <= '9')
			{
				sum += val - '0';
				val = System.in.read();
			}
			
			System.out.println("Digit sum = " + sum);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
