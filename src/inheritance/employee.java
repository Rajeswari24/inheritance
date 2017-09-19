package inheritance;

class testInheritance {
	void salary() {
		System.out.println("The salary is 10000");

	}
}

class student extends testInheritance
{

	void mark()
	{
		System.out.println("the mark is 100");
	}

}
class employee

	{
	public static void main(String[] args)
	
	{
	student s=new student();
	s.mark();
	s.salary();
}
}