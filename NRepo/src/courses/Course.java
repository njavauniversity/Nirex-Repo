package courses;

public class Course {

    public Course(String cName, int unit) {
        name = cName;
        unitCount = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String in) {
        name = in;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int in) {
        unitCount = in;
    }

    private String name;
    private int unitCount;
}
