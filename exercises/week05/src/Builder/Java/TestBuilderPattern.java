package Builder.Java;

public class TestBuilderPattern {

    public static void main(String[] args) {

        //car builder object with sedan blueprint
        CarBuilder carBuilder = new SedanCarBuilder();

        //director with car blueprint (including sedan specs)
        CarDirector director = new CarDirector(carBuilder);

        //building with passes specs
        director.build();

        //checking car
        Car car = carBuilder.getCar();
        System.out.println(car);

        //as above
        carBuilder = new SportsCarBuilder();
        director = new CarDirector(carBuilder);
        director.build();
        car = carBuilder.getCar();
        System.out.println(car);
    }

}
