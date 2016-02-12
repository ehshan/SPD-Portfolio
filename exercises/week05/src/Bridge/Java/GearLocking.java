package Bridge.Java;

public class GearLocking implements Product {

    public String productName;

    public GearLocking(String productName) {
        this.productName = productName;
//        throw new UnsupportedOperationException();
    }

    @Override
    public String productName() {
        return this.productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing "+this.productName());
    }
}