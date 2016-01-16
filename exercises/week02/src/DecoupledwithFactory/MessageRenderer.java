package DecoupledwithFactory;

/**
 * Created by ehshan on 14/01/2016.
 */
public interface MessageRenderer {

    void render();

    MessageProvider getMessageProvider();

    void setMessageProvider(MessageProvider provider);

}
