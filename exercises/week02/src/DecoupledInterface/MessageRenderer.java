package DecoupledInterface;

/**
 * Created by ehshan on 14/01/2016.
 */
public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
