package manyToMany;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="address313")
public class Address3 implements Serializable {
    @Id
    @Column
    private int addressid;

    @Id
    @Column
    private String address;

    @Column
    private String state;

    @Column
    private int pincode;

    @ManyToMany
    private List<Student3> student3 = new ArrayList<>();

    public List<Student3> getStudent3() {
        return student3;
    }

    public void setStudent3(List<Student3> student3) {
        this.student3 = student3;
    }

    public int getAddressid() {
        return addressid;
    }
    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address3{" +
                "addressid=" + addressid +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", student3=" + student3 +
                '}';
    }

    public Address3(){}
}