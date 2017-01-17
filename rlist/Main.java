package rlist;

public class Main
{
	public static void main(String[] args)
	{
		RList vals = new RList(3);
		vals.add(5);
		vals.add(-13);
		vals.add(42);
		vals.add(0);
		
		for(int i = 0; i < vals.count(); i++)
			System.out.println("start    | vals[" + i + "] = " + vals.get(i));
		
		vals.clamp(0, 10);
		
		for(int i = 0; i < vals.count(); i++)
			System.out.println("clamped  | vals[" + i + "] = " + vals.get(i));
		
		vals.filter(4, 9);
		
		for(int i = 0; i < vals.count(); i++)
			System.out.println("filtered |vals[" + i + "] = " + vals.get(i));
	}
}
