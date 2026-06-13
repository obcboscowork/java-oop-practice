public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Oishik", 25,
                                 "Informatik", 88, "Magdeburg");
        Student s2 = new Student("Roxy", 35,
                                 "Nuclear Medicine", 100, "Berlin");
        Student s3 = new Student("Mithun", 29,
                                 "Informatik", 90, "Magdeburg");

        // NORMAL use
        System.out.println("===== INTRODUCTIONS =====");
        s1.introduce();
        s2.introduce();
        s3.introduce();

        System.out.println("\n===== DETAILS =====");
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();

        // TEST GETTERS — reading private fields
        System.out.println("\n===== GETTERS =====");
        System.out.println("Name  : " + s1.getName());
        System.out.println("Age   : " + s1.getAge());
        System.out.println("Grade : " + s1.getGrade());

        // TEST SETTERS — valid changes
        System.out.println("\n===== VALID UPDATES =====");
        s1.setGrade(95);
        System.out.println("Oishik new grade: " + s1.getGrade());
        s1.setName("Oishik Bhanja");
        System.out.println("Oishik new name: " + s1.getName());

        // TEST SETTERS — invalid changes (should be blocked!)
        System.out.println("\n===== INVALID UPDATES (should be blocked) =====");
        s1.setGrade(-500);    // blocked!
        s1.setAge(-99);       // blocked!
        s1.setName("");       // blocked!

        // confirm values didn't change
        System.out.println("Grade still: " + s1.getGrade());
        System.out.println("Age still  : " + s1.getAge());

        // PASS / FAIL
        System.out.println("\n===== PASS / FAIL =====");
        Student[] students = {s1, s2, s3};
        for (int i = 0; i < students.length; i++) {
            if (students[i].hasPassed()) {
                System.out.println(students[i].getName() + " -> PASSED");
            } else {
                System.out.println(students[i].getName() + " -> FAILED");
            }
        }
    }
}
