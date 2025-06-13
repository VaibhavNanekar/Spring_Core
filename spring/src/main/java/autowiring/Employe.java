package autowiring;

public class Employe {
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
