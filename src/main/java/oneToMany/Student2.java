package oneToMany;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="student212")
public class Student2 {
    @Id
    @Column(name="sid")
    private int id;
    @Column(name="sname")
    private String name;
    @Column(name="crs")
    private String course;

//    @OneToMany(mappedBy = "student2",cascade = CascadeType.ALL)
    @OneToMany
    private List<Address2> address = new ArrayList<>();


    public List<Address2> getAddress() {
        return address;
    }

    public void setAddress(List<Address2> address) {
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
                ", address=" + address +
                '}';
    }

    public Student2(){}
}