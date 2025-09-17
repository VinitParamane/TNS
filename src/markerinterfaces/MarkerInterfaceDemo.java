package markerinterfaces;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Student s = new Student(101,"Neha",12000,"Java");
		
		Teacher t = new Teacher();
		
		if(s instanceof Registrable)
		{
			System.out.println("Student is registered for Course");
		}
		else
		{
			System.out.println("Student is not registered for course");
		}
		
		// for teacher class
		
		if(t instanceof Registrable)
		{
			System.out.println("Teacher is registered for Course");
		}
		else
		{
			System.out.println("Teacher is not registered for course");
		}
		

	}

}
