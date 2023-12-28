package EagerLazy;


import javax.persistence.*;

@Entity
@Table(name="address414")
public class Address4 {
    @Id
    @Column
    private int addressid;
    @Column
    private String address;
    @Column
    private String state;
    @Column
    private int pincode;

    @ManyToOne
    private Student4 student4;

    public Student4 getStudent4() {
        return student4;
    }

    public void setStudent4(Student4 student4) {
        this.student4 = student4;
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
        return "Address2{" +
                "addressid=" + addressid +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
//                ", student2=" + student4 +
                '}';
    }

    public Address4(){}
}