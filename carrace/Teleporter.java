package carrace;

public class Teleporter extends Car
{
	int delay;
	int distance;
	
	public Teleporter(String _name, int _delay, int _distance)
	{
		super(_name);
		
		this.delay = _delay;
		this.distance = _distance;
	}

	@Override
	public double getDistance(double time)
	{
		//*** 8 ***
	}

	@Override
	public double getSpeed(double time)
	{
		if(/* *** 9 *** */)
			return this.distance;
		else
			return 0;
	}

	@Override
	public String toString()
	{
		return "Teleporting " + this.name;
	}
}
