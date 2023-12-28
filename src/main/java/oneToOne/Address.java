package oneToOne;

import javax.persistence.*;

@Entity
@Table(name="address199")
public class Address {
    @Id
    @Column
    private int addressid;

    @Column
    private String address1;

    @Column
    private String state;

    @Column
    private int pincode;

    @OneToOne
//    @JoinColumn(name = "sid")
    private Student1 student1;


    public Student1 getStudent1() {
        return student1;
    }

    public void setStudent1(Student1 student1) {
        this.student1 = student1;
    }

    public int getAddressid() {
        return addressid;
    }
    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }
    public String getAddress() {
        return address1;
    }
    public void setAddress(String address) {
        this.address1 = address;
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

    public Address(){}

}