# ☕ Student Database Management System — Java OOP

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Encapsulation-blue?style=flat)
![Status](https://img.shields.io/badge/Status-Active%20Development-green?style=flat)

> A Java project built to practise and demonstrate **Object-Oriented Programming** concepts — specifically **Encapsulation** — through a real student record system with validated data, getters, setters, and a fully tested Main class.

---

## 💡 About the Project

This project models a university student database using a `Student` class with **private fields** and **controlled access** through validated getters and setters. The `Main` class creates student instances and runs through multiple test scenarios — including intentional invalid inputs — to prove the encapsulation works correctly.

Built as interview preparation for a Werkstudent (working student) position in Germany.

---

## 🏗️ OOP Concepts Demonstrated

| Concept | How It's Applied |
|---|---|
| **Encapsulation** | All fields (`name`, `age`, `course`, `grade`, `city`) are `private` |
| **Getters** | `getName()`, `getAge()`, `getCourse()`, `getGrade()`, `getCity()` |
| **Setters with Validation** | Blocks invalid age, empty names, out-of-range grades |
| **Constructor** | Initialises all fields, calls setters for validation at creation |
| **Methods** | `introduce()`, `showDetails()`, `getResult()`, `hasPassed()`, `birthday()` |

---

## 📁 Project Structure

```
java-oop-practice/
├── Student.java     # Student class — fields, constructor, getters, setters, methods
├── Main.java        # Test class — creates students, runs all scenarios
└── .gitignore
```

---

## 🧩 Student Class — Key Logic

```java
public class Student {
    // Private fields — not accessible directly from outside
    private String name;
    private int    age;
    private String course;
    private double grade;
    private String city;

    // Setter with validation — blocks bad data
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be 0-100!");
        }
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid age " + age);
        }
    }

    // Grade-to-letter result
    public String getResult() {
        if      (grade >= 90) return "A - EXCELLENT";
        else if (grade >= 70) return "B - GOOD";
        else if (grade >= 50) return "C - PASS";
        else                  return "F - FAIL";
    }
}
```

---

## ▶️ Program Output

```
===== INTRODUCTIONS =====
Hi! I am Oishik, 25 years old, from Magdeburg
Hi! I am Roxy, 35 years old, from Berlin
Hi! I am Mithun, 29 years old, from Magdeburg

===== DETAILS =====
-----------------------------
NAME   : Oishik
AGE    : 25
COURSE : Informatik
CITY   : Magdeburg
GRADE  : 88.0
RESULT : B - GOOD
-----------------------------
NAME   : Roxy
AGE    : 35
COURSE : Nuclear Medicine
CITY   : Berlin
GRADE  : 100.0
RESULT : A - EXCELLENT
-----------------------------
NAME   : Mithun
AGE    : 29
COURSE : Informatik
CITY   : Magdeburg
GRADE  : 90.0
RESULT : A - EXCELLENT

===== GETTERS =====
Name  : Oishik
Age   : 25
Grade : 88.0

===== VALID UPDATES =====
Oishik new grade: 95.0
Oishik new name: Oishik Bhanja

===== INVALID UPDATES (should be blocked) =====
Error: Grade must be 0-100!
Error: Invalid age -99
Error: Name cannot be empty!
Grade still: 95.0
Age still  : 25

===== PASS / FAIL =====
Oishik Bhanja -> PASSED
Roxy -> PASSED
Mithun -> PASSED
```

---

## 🔒 Encapsulation in Action

The key feature is that **invalid data is silently blocked** — the values stay unchanged:

```
s1.setGrade(-500);   // ❌ Blocked → "Error: Grade must be 0-100!"
s1.setAge(-99);      // ❌ Blocked → "Error: Invalid age -99"
s1.setName("");      // ❌ Blocked → "Error: Name cannot be empty!"

// Values confirmed unchanged after all three bad inputs:
Grade still: 95.0
Age still  : 25
```

---

## 🚧 Currently Learning / Next Steps

- [ ] Inheritance — `GraduateStudent` extending `Student`
- [ ] Polymorphism — overriding `introduce()` in subclasses
- [ ] Abstraction — abstract `Person` base class
- [ ] Interfaces — `Enrollable`, `Gradeable`
- [ ] Collections — `ArrayList<Student>` instead of arrays

---

## 👨‍💻 Author

**Oishik Bhanja Choudhury** — MSc Computer Science, TU Clausthal
- GitHub: [@obcboscowork](https://github.com/obcboscowork)
- LinkedIn: [oishik-digital-lead](https://www.linkedin.com/in/oishik-digital-lead/)
