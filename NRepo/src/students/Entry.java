package students;

public class Entry {

    public static void main(String[] args) {

        // Create two students
        Student student01 = new Student("Aryan", "Mousavi", "Tehran", "021");
        Student student02 = new Student("Danial", "Jerban", "Karaj", "0261");

        // Print everything
        student01.PrintAll();

        // Need a new line
        System.out.println();

        student02.PrintAll();
    }
}
