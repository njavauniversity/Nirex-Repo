package courses;

import java.util.ArrayList;
import java.util.HashMap;

public class Entry {
    public static void main(String[] args) {

        // List of all the courses we might use!
        Course java = new Course("Java SE 8", 3);
        Course cpp = new Course("C++17 Programming", 3);
        Course csharp = new Course("C# Programming", 3);
        Course python = new Course("Python PyLearn", 3);
        Course asp = new Course("ASP.Net", 3);
        Course ado = new Course("ADO.Net", 3);
        Course signalR = new Course("SignalR", 3);
        Course webdev = new Course("Web Design", 3);

        // Student # 001
        ArrayList<Course> tempCourses = new ArrayList<>();
        tempCourses.add(java);
        tempCourses.add(cpp);
        tempCourses.add(python);

        HashMap<Course, Integer> tempGrades = new HashMap<>();
        tempGrades.put(java, 100);
        tempGrades.put(cpp, 100);
        tempGrades.put(python, 100);

        Student tempStudent0 = new Student("Aryan","Mousavi");
        tempStudent0.setCourses(tempCourses);
        tempStudent0.setGrades(tempGrades);

        // Student # 002
        tempCourses = new ArrayList<>();
        tempCourses.add(csharp);
        tempCourses.add(asp);
        tempCourses.add(signalR);

        tempGrades = new HashMap<>();
        tempGrades.put(csharp, 90);
        tempGrades.put(asp, 90);
        tempGrades.put(signalR, 90);

        Student tempStudent1 = new Student("Danial","Jerban");
        tempStudent1.setCourses(tempCourses);
        tempStudent1.setGrades(tempGrades);

        // Print everything!
        tempStudent0.PrintAll();

        // Need a new line!
        System.out.println();

        tempStudent1.PrintAll();
    }

}
