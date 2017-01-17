package rlist;

public class RList
{
	int val;
	RList next = null;
	
	public RList(int startVal)
	{
		this.val = startVal;
	}
	
	public void add(int val)
	{
		/*List curr = this;
		while(curr.next != null)
			curr = curr.next;
		
		curr.next = new List(val);*/
		
		if(this.next == null)
			this.next = new RList(val);
		else
			this.next.add(val);
	}
	
	public int get(int index) //*** 2 ***
	{
		if(index == 0)
			return this.val;
		else
			return this.next.get(index - 1);
	}
	
	public int count()
	{
		return 5;
		//*** 1 ***
	}
	
	public void clamp(int min, int max)
	{
		//*** 3 ***
	}
	
	public void filter(int min, int max)
	{
		//*** 4 ***
	}
}
