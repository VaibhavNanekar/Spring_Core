package springlifecyclexmlinteranno;
// Spring life cycle using xm;
public class Samosa {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
        System.out.println("setting price");
    }

    public Samosa(String price) {
        this.price = price;
    }
    public Samosa(){
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price='" + price + '\'' +
                '}';
    }
    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("Inside destroy method ");
    }
}
