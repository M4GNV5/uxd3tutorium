package basics;

public class Lecture
{
	char building;
	int roomNumber;

	String professor;

	//*** 5 ***
	Student[] students;

	public Lecture(String room, String prof, int maxStudents)
	{
		this.professor = prof;

		//*** 3 ***

		//*** 4 ***
	}

	public void addStudent(String name, String firstName, int age)
	{
		//*** 5 ***
	}
	
	//*** 8 ***

	public Student[] getStudents()
	{
		//*** 6 ***
	}

	public String toString()
	{
		String str = "Lecture in " + building + "" + roomNumber + " by " + professor;

		for(/* 7 */; /* 7 */; i++)
		{
			//*** 7 ***
		}

		return str;
	}
}
