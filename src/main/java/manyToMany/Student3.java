package manyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="student313")
public class Student3 {
    @Id
    @Column(name="sid")
    private int id;
    @Column(name="sname")
    private String name;
    @Column(name="crs")
    private String course;

    @ManyToMany
    @JoinTable(
            name = "Kch_Bhi",
            joinColumns = @JoinColumn(name = "Idstudent"),
            inverseJoinColumns = {@JoinColumn(name = "Idaddress"),@JoinColumn(name = "adreess2")}

    )

    private List<Address3> address = new ArrayList<Address3>();


    public List<Address3> getAddress() {
        return address;
    }

    public void setAddress(List<Address3> address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", address=" + address +
                '}';
    }

    public Student3(){}
}