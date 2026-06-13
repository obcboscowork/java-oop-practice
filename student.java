public class Student {

    // PRIVATE fields — nobody can touch directly
    private String name;
    private int    age;
    private String course;
    private double grade;
    private String city;

    // CONSTRUCTOR
    Student(String name, int age, String course,
            double grade, String city) {
        this.name   = name;
        setAge(age);       // use setter for validation
        this.course = course;
        setGrade(grade);   // use setter for validation
        this.city   = city;
    }

    // GETTERS — read private fields
    public String getName()   { return name; }
    public int    getAge()    { return age; }
    public String getCourse() { return course; }
    public double getGrade()  { return grade; }
    public String getCity()   { return city; }

    // SETTERS — write with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid age " + age);
        }
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be 0-100!");
        }
    }

    public void setCourse(String course) {
        if (course != null && !course.isEmpty()) {
            this.course = course;
        } else {
            System.out.println("Error: Course cannot be empty!");
        }
    }

    // METHODS
    public void introduce() {
        System.out.println("Hi! I am " + name +
                           ", " + age + " years old" +
                           ", from " + city);
    }

    public void showDetails() {
        System.out.println("-----------------------------");
        System.out.println("NAME   : " + name);
        System.out.println("AGE    : " + age);
        System.out.println("COURSE : " + course);
        System.out.println("CITY   : " + city);
        System.out.println("GRADE  : " + grade);
        System.out.println("RESULT : " + getResult());
    }

    public String getResult() {
        if      (grade >= 90) return "A - EXCELLENT";
        else if (grade >= 70) return "B - GOOD";
        else if (grade >= 50) return "C - PASS";
        else                  return "F - FAIL";
    }

    public boolean hasPassed() {
        return grade >= 50;
    }

    public void birthday() {
        age++;
        System.out.println("Happy Birthday " + name +
                           "! Now " + age + " years old!");
    }
}
