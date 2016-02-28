package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sml.MulInstruction;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class MulInstructiTest {

    MulInstruction instruction = new MulInstruction("mul",1,2,3);

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testExecute() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

        assertEquals(instruction.toString(), "mul: mul 2 * 3 to 1");
    }
}