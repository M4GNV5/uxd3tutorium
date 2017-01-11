package name;

import java.security.InvalidParameterException;

public class Name
{
	public String firstName;
	public String secondName;
	public String alias;
	public String name;
	
	public Name(String input) throws InvalidParameterException
	{
		String[] nameParts = input.split(" ");
		if(nameParts.length > 4)
			throw new InvalidParameterException("Too many name parts");
		if(nameParts.length < 2)
			throw new InvalidParameterException("Not enough name parts");
		
		//*** 1 ***
		
		if(nameParts.length == 2)
			return;

		//*** 4 ***
		
		if(nameParts.length == 3)
			return;
		
		//*** 5 ***
	}
	
	boolean isAliasName(String name)
	{
		//*** 2 ***
	}
	
	String convertAliasName(String name)
	{
		//*** 3 ***
	}
}
