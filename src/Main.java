public class Main {

    public static void main(String[] args){
        // Instantiates three new student objects
        Student student1 = new Student("Kyle Cannon");
        Student student2 = new Student("Cole Lamothe");
        Student student3 = new Student("Daniel Kuiumdjian");

        // Displays student information
        System.out.println(student1.toString());
        System.out.println();
        System.out.println(student2.toString());
        System.out.println();
        System.out.println(student3.toString());
        System.out.println();

        // Changes the value of a static variable inside of a specific instance of that object
        student1.ChangeUniName("Ontario Tech University");

        // Outputs the students with the new university name being displayed across all instances
        System.out.println(student1.toString());
        System.out.println();
        System.out.println(student2.toString());
        System.out.println();
        System.out.println(student3.toString());
        System.out.println();


    }
}
