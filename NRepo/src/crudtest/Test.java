package crudtest;

public class Test {
    public static void main(String[] args) throws Exception {
        Student std0 = new Student(1,"Aryan","Mousavi","Tehran");
        std0.Insert();

        Student std1 = new Student(2,"Danial","Jerban","Karaj");
        std0.Update(std1);

        std0.Delete();
    }
}
