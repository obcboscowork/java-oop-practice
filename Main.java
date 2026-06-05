public class Main
{
	public static void main(String[]args)
	{
		Student s1 = new Student(" Mithun ", 29 , "Informatik" ,90, " Magdeburg ");
		Student s2 = new Student(" Roxy ", 35, " NuclearMedizine ",100, " Berlin ");
		Student s3 = new Student(" Naggesh ", 24," Intelligent Manufacturing ",95, " Bremerhafen ");
		Student s4 = new Student(" Shaktesh ",27," Intelligent Manufacturing ",93," Wolfsburg Hauptbahnhof ");
		Student s5 = new Student(" Nandu",25," Intelligent Manufacturing ",99, " Nepali Lautenthal ");
	
		System.out.println("======INTRODUCTION======");
		s1.introduce();
		s2.introduce();
		s3.introduce();
		s4.introduce();
		s5.introduce();
		
		System.out.println("\n=======DETAILS=======");
		s1.showDetails();
		s2.showDetails();
		s3.showDetails();
		s4.showDetails();
		s5.showDetails();
		
		System.out.println("\n=======PASS/FAIL=======");
		Student[] students = {s1,s2,s3,s4,s5};
		for(int i = 0 ; i < students.length ; i++)
		{
			if(students[i].hasPassed())
			{
				System.out.println(students[i].name + "->PASSED");
			}
			else
			{
				System.out.println(students[i].name + "->FAILED");
			}
		}

		System.out.println("\n=======CLASS AVERAGE =====");
		double total = 0;
		for(int i = 0; i <students.length; i++)
		{
			total += students[i].grade;
		}
		double average = total / students.length;
		System.out.println("Class average: " + average);

		System.out.println("\n=========BIRTHDAYS=======");
		s1.birthday();
		s2.birthday();
		s3.birthday();
		s4.birthday();
		s5.birthday();
	}
}
