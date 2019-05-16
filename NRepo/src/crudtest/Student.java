package crudtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {
    Connection con;
    PreparedStatement statement;

    int sID;
    String firstName;
    String lastName;
    String city;

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(int SID, String FirstName, String LastName, String City) throws Exception {
        sID = SID;
        firstName = FirstName;
        lastName = LastName;
        city = City;

        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nirex", "nirex");
    }

    public void Insert() throws SQLException {
        statement = con.prepareStatement("insert into Student values(?,?,?,?)");
        statement.setInt(1, sID);
        statement.setString(2, firstName);
        statement.setString(3, lastName);
        statement.setString(4, city);
        statement.executeUpdate();
    }

    public void Delete() throws SQLException {
        statement = con.prepareStatement("delete from Student where SID=?");
        statement.setInt(1, sID);
        statement.executeUpdate();
    }

    public void Update(Student st) throws SQLException {

        statement = con.prepareStatement("update Student set FirstName=? where SID=?");
        statement.setString(1, st.firstName);
        statement.setInt(2, sID);
        statement.executeUpdate();

        statement = con.prepareStatement("update Student set LastName=? where SID=?");
        statement.setString(1, st.lastName);
        statement.setInt(2, sID);
        statement.executeUpdate();

        statement = con.prepareStatement("update Student set City=? where SID=?");
        statement.setString(1, st.city);
        statement.setInt(2, sID);
        statement.executeUpdate();
    }


}
