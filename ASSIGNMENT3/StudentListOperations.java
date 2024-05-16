import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return age == student.age &&
                Double.compare(student.mark, mark) == 0 &&
                name.equals(student.name);
    }
}

public class StudentListOperations {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();

        // Add some student objects
        studentList.add(new Student("Alice", 20, 85.5));
        studentList.add(new Student("Bob", 21, 90.0));
        studentList.add(new Student("Charlie", 22, 75.0));

        // (a) Display the list
        displayList(studentList);

        // (b) Search for a student object
        searchStudent(studentList);

        // (c) Remove a specified student object
        removeStudent(studentList);

        // (d) Count the number of objects present in the list
        int count = studentList.size();
        System.out.println("Number of student objects present in the list: " + count);

        // (e) Override equals method checking if two student objects are the same
        Student s1 = new Student("Alice", 20, 85.5);
        Student s2 = new Student("Alice", 20, 85.5);
        System.out.println("Are s1 and s2 equal? " + s1.equals(s2));
    }

    private static void displayList(LinkedList<Student> studentList) {
        System.out.println("List of Student Objects:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Mark: " + student.getMark());
        }
    }

    private static void searchStudent(LinkedList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student to search:");
        String name = scanner.nextLine();
        System.out.println("Enter the age of the student to search:");
        int age = scanner.nextInt();
        System.out.println("Enter the mark of the student to search:");
        double mark = scanner.nextDouble();

        Student searchStudent = new Student(name, age, mark);
        boolean isReferenceEqual = studentList.contains(searchStudent);
        boolean isContainEqual = false;
        for (Student student : studentList) {
            if (student.equals(searchStudent)) {
                isContainEqual = true;
                break;
            }
        }

        System.out.println("Is the object found using reference? " + isReferenceEqual);
        System.out.println("Is the object found using contains? " + isContainEqual);
    }

    private static void removeStudent(LinkedList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student to remove:");
        String name = scanner.nextLine();
        System.out.println("Enter the age of the student to remove:");
        int age = scanner.nextInt();
        System.out.println("Enter the mark of the student to remove:");
        double mark = scanner.nextDouble();

        Student removeStudent = new Student(name, age, mark);
        studentList.remove(removeStudent);
        System.out.println("Student removed successfully.");
    }
}