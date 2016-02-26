package Tests;

import sml.Machine;
import sml.Registers;
import sml.SubInstruction;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class SubInstructionTest {

    SubInstruction instruction = new SubInstruction("sub", 1, 3, 2);

    @org.junit.Before
    public void setUp() throws Exception {


    }

    @org.junit.After
    public void tearDown() throws Exception {
        instruction = null;
    }

    @org.junit.Test
    public void testExecute() throws Exception {

    }

    @org.junit.Test
    public void testToString() throws Exception {

        assertEquals(instruction.toString(), "sub: sub 3 - 2 to 1");
    }
}