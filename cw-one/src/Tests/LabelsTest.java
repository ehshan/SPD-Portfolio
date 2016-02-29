package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sml.Labels;

import static org.junit.Assert.*;

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

        //checks that labels contain values
        assertEquals(0,labels.indexOf("f0"));

    }

    @Test
    public void labelNotFound() throws Exception {

        //looking for a label not in list
        assertEquals(-1,labels.indexOf("f4"));

    }

    @Test
    public void testAddLabel() throws Exception {

        //adding a new label
        labels.addLabel("f3");

        assertEquals(3,labels.indexOf("f3"));

    }

    @Test
    public void testToString() throws Exception {

    }

    @Test
    public void testReset() throws Exception {

    }
}