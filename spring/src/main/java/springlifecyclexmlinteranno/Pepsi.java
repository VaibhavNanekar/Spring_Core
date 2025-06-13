package springlifecyclexmlinteranno;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Spring life cycle using interface
public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi(double price) {
        this.price = price;
    }
    public Pepsi(){
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }
// afterPropertiesSet method provided functionality only for the init method.Not for the distroy
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("taking pepsi : init");
    }
//destroy method provided functionality only for the destroy method
    @Override
    public void destroy() throws Exception {
        System.out.println("put bottle : after destroy");
    }
}
