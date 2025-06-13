package autowiringwithannotaion;

import autowiring.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("emp1")
public class Employe {
    @Autowired
    @Qualifier("add2")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Employe(){
        super();
    }

    public Employe(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "address=" + address +
                '}';
    }
}
