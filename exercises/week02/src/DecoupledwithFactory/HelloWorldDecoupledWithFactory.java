package DecoupledwithFactory;

/**
 * Created by ehshan on 14/01/2016.
 */
public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        // getInstance() is part of Singleton pattern, enabling MessageSupportFactory to
        // return a single reference of itself, which getMessageRenderer() is then called on
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
