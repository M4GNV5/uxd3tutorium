/*package name;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class NameTests
{
	public void testName(String raw, String first, String second, String alias, String name)
	{
		Name testName;
		try
		{
			testName = new Name(raw);
		}
		catch(InvalidParameterException e)
		{
			if(first != null || name != null)
				fail(e.getMessage());
			
			return;
		}
		
		assertEquals("first name did not match", testName.firstName, first);
		assertEquals("second name did not match", testName.secondName, second);
		assertEquals("alias did not match", testName.alias, alias);
		assertEquals("name did not match", testName.name, name);
	}
	
	@Test
	public void simpleName()
	{
		testName("Bellatrix Lestrange", "Bellatrix", null, null, "Lestrange");
	}
	
	@Test
	public void secondName()
	{
		testName("Harry James Potter", "Harry", "James", null, "Potter");
	}
	
	@Test
	public void aliasName()
	{
		testName("Ronald \"Ron\" Weasely", "Ronald", null, "Ron", "Weasely");
	}
	
	@Test
	public void secondAliasName()
	{
		testName("Hermione Jean \"Hermy\" Granger", "Hermione", "Jean", "Hermy", "Granger");
		testName("Hermione \"Hermy\" Jean Granger", "Hermione", "Jean", "Hermy", "Granger");
	}
	
	@Test
	public void tooShortName()
	{
		testName("Voldemort", null, null, null, null);
	}
	
	@Test
	public void tooLongName()
	{
		testName("Albus Precival Wulfric Brian Dumbledore", null, null, null, null);
	}
	
	@Test
	public void doubleAlias()
	{
		//TODO
	}
	
	@Test
	public void twoSecondNames()
	{
		//TODO
	}
}*/
