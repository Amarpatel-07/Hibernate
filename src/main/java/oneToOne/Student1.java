package oneToOne;

import javax.persistence.*;

@Entity
@Table(name="student199")
public class Student1 {


    @Column(name="sid")
    @Id
    private int id;

    @Column(name="sname")
    private String name;

    @Column(name="crs")
    private String course;

    @OneToOne(mappedBy = "student1")
//    @OneToOne
    private Address address;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
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
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
//                ", address=" + address +
                '}';
    }

    public Student1(){}
}