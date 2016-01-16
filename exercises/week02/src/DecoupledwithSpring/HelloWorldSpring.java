package DecoupledwithSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by ehshan on 16/01/2016.
 */
public class HelloWorldSpring {


    public static void main(String[] args) throws Exception {

        BeanFactory factory = getBeanFactory();

        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        MessageProvider mp = (MessageProvider) factory.getBean("provider");

        mr.setMessageProvider(mp);
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // Understanding DefaultListableBeanFactory not very
        // important. It's just a Factory class example from Spring.
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(factory);

        Properties props = new Properties();
        props.load(new FileInputStream("beans.properties"));

        rdr.registerBeanDefinitions(props);

        return factory;
    }
}
