package oneToMany;

import javax.persistence.*;

@Entity
@Table(name="address212")
public class Address2 {
    @Id
    @Column(name = "address_id")
    private int addressId;

    @Column
    private String address;

    @Column
    private String state;

    @Column
    private int pincode;

    @ManyToOne
    private Student2 student2;

    public Student2 getStudent2() {
        return student2;
    }

    public void setStudent2(Student2 student2) {
        this.student2 = student2;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
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
                "addressid=" + addressId +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", student2=" + student2 +
                '}';
    }

    public Address2(){}
}