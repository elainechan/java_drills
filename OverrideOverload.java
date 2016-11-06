// Example 1
// Overriding
class Dog 
{
	publc void bark()
	{
		System.out.println("woof ");
	}

}

class Hound extends Dog
{
	public void sniff()
	{
		System.out.println("sniff ");
	}
	public void bark()
	{
		System.out.println("bowl ");
	}
}

public class OverridingTest
{
	public static void main(String [] args)
	{
		Dog d = new Hound();
		d.bark(); // Output: bowl
	}
}

// Overloading
class Dog
{
	public void bark()
	{
		System.out.println("woof ");
	}
	// Overloading method
	public void bark(int num)
	{
		for(int i=0; i<num; i++)
			System.out.println("woof ");
	}
}

//-------------------------

// Example 2
public class Person
{
	private String name;
	public String toString()
	{
		return this.getName();
	}
}

Person p = new Person("Tim");
System.out.println(p);

// Overriding
public class Student extends Person
{
	private int studentID;
	public int getSID()
	{
		return studentID;
	}
	public String toString()
	{
		// Uses method from superclass
		return this.getSID() + ": " + super.toString();
	}
}

Student s = new Student("Cara", 1234);
System.out.println(s);

Person s = new Student("Cara", 1234);
System.out.println(s);