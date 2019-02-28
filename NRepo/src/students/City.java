package students;

public class City {

    public City(String nName, String nCode) {
        name = nName;
        code = nCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String in) {
        name = in;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String in) {
        code = in;
    }

    private String name;
    private String code;
}
