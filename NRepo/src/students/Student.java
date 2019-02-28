package students;

import courses.Course;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    public Student(String fName, String lName, String cityName, String cityCode) {
        city = new City(cityName, cityCode);
        firstName = fName;
        lastName = lName;
    }

    public void PrintAll() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("City Name: " + city.getName());
        System.out.println("City Code: " + city.getCode());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String in) {
        firstName = in;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String in) {
        lastName = in;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City in) {
        city = in;
    }

    private String firstName;
    private String lastName;
    private City city;
}
