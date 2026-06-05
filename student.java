public class Student
{
	String name;
	int age;
	String course;
	double grade;
	String city;

Student (String name, int age, String course, double grade, String city)
{
	this.name = name;
	this.age = age;
	this.course = course;
	this.grade = grade;
	this.city = city;
}
void introduce()
{
	System.out.println("Hi!I am " + name + "," + age + "years old" + ", from" + city);
}
void showDetails()
{
	System.out.println("------------------");
	System.out.println("NAME   : " + name);
	System.out.println("AGE    : " + age);
	System.out.println("COURSE : " + course);
        System.out.println("CITY   : " + city);
 	System.out.println("GRADE  : " + grade);
	System.out.println("RESULT : " + getResult());
}
String getResult()
{
	if (grade >=90) return "A - EXCELLENT";
	else if (grade >= 70) return "B - GOOD";
	else if (grade >= 50) return "C - PASS";
	else 		      return "F - FAIL";
}
boolean hasPassed()
{
	return grade >= 50;
}
void birthday()
{
	age++;
	System.out.println("Happy Birthday " + name + "! Now " + age + " years old!");
}
}
