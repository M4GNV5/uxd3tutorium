public class Scoping
{
	Strint title;
	String name;

	int[] values;

	public Scoping(String name, String title)
	{
		name = name;
		title = title;
	}

	getName()
	{
		if(title == null)
		{
			String fullName = title + " " + name;
		}
		else
		{
			String fullName = name;
		}

		return fullName;
	}

	void fillValues(int start, int end)
	{
		int len = end - start;
		int[] values = new int[len];

		for(int i = 0; i < len; i++)
		{
			values[i] = start + i;
		}
	}
}
