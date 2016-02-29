package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sml.Labels;


/**
 * @author Ehshan Veerabangsa
 */
public class LabelsTest {

    private Labels labels = new Labels();


    @Before
    public void setUp() throws Exception {

        labels.addLabel("f0");
        labels.addLabel("f1");
        labels.addLabel("f2");

    }

    @After
    public void tearDown() throws Exception {

        labels = null;
    }


    @Test
    public void testIndexOf() throws Exception {

    }


    @Test
    public void testAddLabel() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }

    @Test
    public void testReset() throws Exception {

    }
}