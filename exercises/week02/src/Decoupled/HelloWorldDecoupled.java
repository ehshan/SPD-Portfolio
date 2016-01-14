package Decoupled;

/**
 * Created by ehshan on 14/01/2016.
 */
public class HelloWorldDecoupled {
    public static void main(String[] args) {
        StandardOutMessageRenderer mr = new StandardOutMessageRenderer();
        HelloWorldMessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
