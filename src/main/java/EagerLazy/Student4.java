package EagerLazy;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="student414")
public class Student4 {
    @Id
    @Column(name="sid")
    private int id;
    @Column(name="sname")
    private String name;
    @Column(name="crs")
    private String course;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Address4> address = new ArrayList<>();


    public List<Address4> getAddress() {
        return address;
    }

    public void setAddress(List<Address4> address) {
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

    public  Student4(){}
}