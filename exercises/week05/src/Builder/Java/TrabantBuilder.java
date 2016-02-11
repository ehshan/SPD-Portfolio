package Builder.Java;

public class TrabantBuilder implements CarBuilder {

    // car object
    private final Car car = new Car("TRABANT");

    @Override
    public void buildBodyStyle() {
        car.setBodyStyle(" Uni-body construction. Not exactly great");
    }

    @Override
    public void buildPower() {
        car.setPower("27hp @ 4,200 rpm; 38 ft lb of torque @ 3,000 rpm");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Air cooled, 0.6-liter 2-stroke 2-cylinder");
    }

    @Override
    public void buildBreaks() {
        car.setBreaks("4-wheel hydraulic drum");
    }

    @Override
    public void buildSeats() {
        car.setSeats("Bucket recliner");
    }

    @Override
    public void buildWindows() {
        car.setWindows("Are made of glass");
    }

    @Override
    public void buildFuelType() {
        car.setFuelType("4 Star");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
