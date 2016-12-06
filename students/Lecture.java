package students;

public class Lecture
{
	char building;
	int roomNumber;

	String professor;
	Student[] students;

	public Lecture(String room, String prof, int maxStudents)
	{
		this.professor = prof;

		this.students = new Student[maxStudents];

		this.building = room.charAt(0);
		this.roomNumber = Integer.parseInt(room.substring(1));
	}

	public void addStudent(String name, String firstName, int age)
	{
		for(int i = 0; i < students.length; i++)
		{
			if(students[i] == null)
			{
				students[i] = new Student(name, firstName, age);
			}
		}
	}
	
	public void removeStudent(String name)
	{
		for(int i = 0; i < students.length; i++)
		{
			if(students[i].name.equals(name))
			{
				students[i] = null;
			}
		}
	}

	public Student[] getStudents()
	{
		return students;
	}

	public String toString()
	{
		String str = "Lecture in " + building + "" + roomNumber + " by " + professor;

		for(int i = 0; i < students.length; i++)
		{
			if(students[i] != null)
				str += ", " + students[i].toString();
		}

		return str;
	}
}
