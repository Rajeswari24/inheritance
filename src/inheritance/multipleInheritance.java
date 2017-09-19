package inheritance;
interface runnable
{
	void print();
	
}
interface printable
{
void print();
}

class multipleInheritance implements printable,runnable
{
public void print()
{
	System.out.println("Hello..hi");
	}

public static void main(String args[]){
multipleInheritance obj = new multipleInheritance();
obj.print();
 }

}
