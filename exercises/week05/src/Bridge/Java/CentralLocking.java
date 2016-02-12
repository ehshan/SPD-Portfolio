package Bridge.Java;

public class CentralLocking implements Product {

    public String productName;

    public CentralLocking(String productName) {
        this.productName = productName;
//        throw new UnsupportedOperationException();
    }

    @Override
    public String productName() {
        return this.productName;
//        throw new UnsupportedOperationException();
    }

    @Override
    public void produce() {
        System.out.println("Producing "+this.productName());
//        throw new UnsupportedOperationException();
    }
}
