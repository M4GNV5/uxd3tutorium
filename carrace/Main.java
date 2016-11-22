package carrace;

import java.io.FileWriter;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Car[] cars = new Car[3];
		//*** 10 ***
		
		
		
		
		
		FileWriter distance = new FileWriter("distance.dat");
		FileWriter speed = new FileWriter("speed.dat");
		
		for(int i = 0; i < cars.length; i++)
		{
			distance.write("\"" + cars[i] + "\"\n");
			speed.write("\"" + cars[i] + "\"\n");
			
			for(int t = 0; t < 50; t++)
			{
				distance.write(t + "\t" + cars[i].getDistance(t) + "\n");
				speed.write(t + "\t" + cars[i].getSpeed(t) + "\n");
			}
			
			distance.write("\n\n");
			speed.write("\n\n");
		}
		
		distance.close();
		speed.close();
	}
}
