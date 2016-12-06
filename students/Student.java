package students;

public class Student
{
	String name;
	String firstName;
	int age;

	public Student(String name, String firstName, int age)
	{
		this.name = name;
		this.firstName = firstName;
		this.age = age;
	}

	@Override
	public String toString()
	{
		return this.firstName + " " + this.name;
	}
}
