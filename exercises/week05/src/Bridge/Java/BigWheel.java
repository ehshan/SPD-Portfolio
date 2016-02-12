package Bridge.Java;

public class BigWheel extends Car {

    public BigWheel(Product product, String carType) {
        super(product, carType);
//        throw new UnsupportedOperationException();
//
    }

    @Override
    public void assemble() {
        System.out.println("Assembling "+super.product.productName()+" "+super.carType);
//        throw new UnsupportedOperationException();
    }

    @Override
    public void produceProduct() {
        System.out.println("Producing "+super.product.productName());
        System.out.println("Modifying product"+super.product.productName()+" according to "+super.carType);
//        throw new UnsupportedOperationException();
    }


}