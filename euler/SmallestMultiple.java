package euler;

public class SmallestMultiple
{
	public static void main(String[] args)
	{
		for(int i = 1;; i++)
		{
			int j;
			for(j = 1; j <= 20; j++)
			{
				if(i % j != 0)
					break;
			}
			
			if(j == 21)
			{
				System.out.println("Found number " + i);
				return;
			}
		}
	}
}
