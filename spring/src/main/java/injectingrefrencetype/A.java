package injectingrefrencetype;

public class A {
    private int x;
    private B ob;

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public A(){
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "ob=" + ob +
                ", x=" + x +
                '}';
    }
}
