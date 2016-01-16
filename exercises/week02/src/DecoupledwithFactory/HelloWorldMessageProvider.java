package DecoupledwithFactory;

/**
 * Created by ehshan on 14/01/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World!";
    }

}
