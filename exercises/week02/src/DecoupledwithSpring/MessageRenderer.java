package DecoupledwithSpring;

/**
 * Created by ehshan on 16/01/2016.
 */
public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
