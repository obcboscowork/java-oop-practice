public class Methods
{
	static void greet(String name)
	{
	System.out.println("hello :"+name+": Welcome to bridge");
	}

	static int add(int a, int b)
	{
		return a + b;
	}
	static int findMax(int a, int b)
	{
		if (a > b)
		return a;
		else return b;
	}
	static String evenOrOdd(int number)
	{
		if(number % 2 == 0)
		return "Even";
		else 
		return "odd";
	}
	static double rectangleArea(double width, double height)
	{
		return width * height;
	}
	static boolean isAdult(int age)
	{
		return age >= 18;
	}
	static void repeatWord(String word, int times)
	{
		for (int i = 1; i<=times; i++)
		System.out.println(i + ":" + word);
	}
	static String getGrade(double score)
	{
		if(score >= 90)
		return "A-Excellent";
		else if(score >= 70)
		return "B-Good";
		else if(score >= 50)
		return "C- Pass";
		else
		return "F-Fail";
	}
	static int multiply(int a, int b)
	{
		return a * b;
	}
	static double celciusToFahrenheit(double c)
	{
		return (c*(9/5)+32);
	}
	static boolean isPositive(int number)
	{
		if (number > 0)
		return true;
		else
		return false;
	}

	public static void main(String args[])
	{
		System.out.println("-----GREET-----");
		greet("Oishik");
		greet("Roxi");

		System.out.println("\n------MATH----");
		System.out.println("5+10 = " + add(5,10));
		System.out.println("Max of 8 and 15 = " + findMax(8,15));
		System.out.println("Max of 99 and 3 = " + findMax(99,3));

		System.out.println("\n----- Even or odd----");
		System.out.println("4 is " + evenOrOdd(4));
		System.out.println("7 is " + evenOrOdd(7));

		System.out.println("\n-----AREA-----");
		System.out.println("Area 5*3 ="+ rectangleArea(5,3));
		System.out.println("Area 10.5*4.2 =" + rectangleArea(10.5,4.2));

		System.out.println("\n----ADULT CHECK-----");
		System.out.println("Age 20 is adult:" + isAdult(20));
		System.out.println("Age 15 is adult:" + isAdult(15));

		System.out.println("\n-----GRADES-----");
		System.out.println("Score 95: " + getGrade(95));
		System.out.println("Score 72: " + getGrade(72));
		System.out.println("Score 45: " + getGrade(45));

		System.out.println("\n------REPEAT-------");
		repeatWord("java",4);

		System.out.println("\n------MULTIPLY-----");
		System.out.println("7 * 9: " + multiply(7,9));
		
		System.out.println("\n------CONVERSION-----");
		System.out.println("30 degree celsius is : " + celciusToFahrenheit(30));
		System.out.println("\n------NUMBERCHECK------");
		System.out.println(" 5 is a positive number: "+ isPositive(5));
	}
}
