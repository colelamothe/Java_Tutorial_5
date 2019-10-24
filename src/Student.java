public class Student {

    private static String university = "UOIT"; // Static so that the university name can be easily changed for all students
    private static int bannerId = 1000000; // serves as a counter to ensure unique student ID numbers
    private String studentName;
    private int studentID;

    public Student(String name){
        studentName = name;
        studentID = bannerId; // sets the student ID then increments it for the next student object to use
        bannerId++;
    }

    public static void ChangeIDRange(int newRange){
        bannerId = newRange;
    }

    public static void ChangeUniName(String newName){ // Static method can only use static or local variables
        university = newName; // changes the static variable value for all instances of the object
    }

    public String toString(){ // Basic output of student information
        return "University:\t" + university + "\nStudent Name:\t" + studentName + "\nStudent ID:\t" + studentID;
    }

}
