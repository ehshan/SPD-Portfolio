package DecoupledwithSpring;

/**
 * Created by ehshan on 16/01/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {

        return "Hello World!";
    }
}
