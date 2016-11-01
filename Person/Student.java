public class Student extends Person
{

	private int id;

	public Student(String n)
	{

		this( "Student" );
		// The following also works but not preferred
		// super(n);


	}

	public int getID() {return id;}

}