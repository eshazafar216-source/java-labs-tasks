public class UniversityPersonnel {
    String name;
    int age;
    String gender;

    UniversityPersonnel(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }

    public static void main(String[] args) {
        Student s = new Student("Maaria", 20, "Female", "BSCS", 3.5, 5);
        Teacher t = new Teacher("Ali", 35, "Male", "Lecturer", 120000, "Computer Science");

        s.displayStudentInfo();
        System.out.println();
        t.displayTeacherInfo();
    }
}

class Student extends UniversityPersonnel {
    String degreeProgram;
    double cgpa;
    int semester;

    Student(String name, int age, String gender, String degreeProgram, double cgpa, int semester) {
        super(name, age, gender);
        this.degreeProgram = degreeProgram;
        this.cgpa = cgpa;
        this.semester = semester;
    }

    void displayStudentInfo() {
        System.out.println("---Student Information---");
        displayInfo();
        System.out.println("Degree Program : " + degreeProgram);
        System.out.println("CGPA : " + cgpa);
        System.out.println("Semester : " + semester);
    }
}

class Teacher extends UniversityPersonnel {
    String designation;
    double salary;
    String department;

    Teacher(String name, int age, String gender, String designation, double salary, String department) {
        super(name, age, gender);
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    void displayTeacherInfo() {
        System.out.println("---Teacher Information---");
        displayInfo();
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
    }
}
